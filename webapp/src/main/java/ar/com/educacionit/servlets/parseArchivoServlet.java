package ar.com.educacionit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.impl.ProductoServiceImpl;
import ar.com.educacionit.servlets.parser.FileParser;
import ar.com.educacionit.servlets.parser.FileParserFactory;
import ar.com.educacionit.servlets.parser.FileTypeEnum;

@WebServlet("/parseArchivoServlet")

public class parseArchivoServlet extends HttpServlet {
	
	private ProductoService ps = new ProductoServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nombreFile = "nuevos-productos.doc";
		
		//Tomo del nombreFile las últimas tres letras para quedarme con la extensión del archivo		
		//String tipoArchivo = nombreFile.substring(nombreFile.length() - 3, nombreFile.length());
		
		String tipoArchivo = "";

		int i = nombreFile.lastIndexOf('.');
		
		if (i > 0) {
			
		    tipoArchivo = nombreFile.substring(i+1);
		    
		}
		
		FileTypeEnum typeEnum = FileTypeEnum.getEnumByTipoArchivo(tipoArchivo);
		
		//Creamos el parser
		FileParser <List<Producto>> fileParser = FileParserFactory.getFileParserByEnum(typeEnum);
		
		if(fileParser == null) {
			
			//vuelve a cargar el archivo
			
			RequestDispatcher rd = req.getRequestDispatcher("cargarProductos.jsp");
			
			req.setAttribute("errorParser", "No existe parser para el tipo de archivo ." + tipoArchivo);
			
			rd.forward(req, resp);
			
		}else {
		
		String filePath = getServletContext().getRealPath(nombreFile);
		
		fileParser.setPath(filePath);
		
		List<Producto> list = fileParser.parseArchivo();
		
		//separo en dos listas los productos que se crearán ok y los fail
		
		List<Producto> listadoOk = new ArrayList<>();
		
		List<Producto> listadoFail = new ArrayList<>();
		
		//procesamos nuestra lista
		
		for (Producto producto : list) {
			
			try {
				
				ps.crearProducto(producto);
				
				listadoOk.add(producto);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
				listadoFail.add(producto);
				
			}
					
		}
		
		//guardar en el request el listado de productos creados ok y los fail
		
		req.setAttribute("listadoOk", listadoOk);
		
		req.getSession().setAttribute("listadoFail", listadoFail);
		
		RequestDispatcher rd = req.getRequestDispatcher("listadoGeneral.jsp");
		
		rd.forward(req, resp);
		
		}
		
	}
		
}
