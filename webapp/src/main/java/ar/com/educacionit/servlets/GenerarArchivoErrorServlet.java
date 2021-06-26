package ar.com.educacionit.servlets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;

@WebServlet("/generarArchivoErrorServlet")

public class GenerarArchivoErrorServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//bajar los datos desde la session
		
		@SuppressWarnings("unchecked")
		List<Producto> listado = (List<Producto>)req.getSession().getAttribute("listadoFail");
		
		//armar el path donde voy a grabar el file
		
		String filePathOutput = "C:" + File.separator + "Users" + File.separator + "royla" + File.separator 
				+ "Downloads" + File.separator + "Listado-producto.error2.csv";
		
		//crear el file (puntero)
		
		File outputFile = new File(filePathOutput);
		
		//chequeo si el puntero ya tiene un archivo en él
		
		if(!outputFile.exists()) {
			
			//Files.createFile(outputFile.toPath());			
			
		//}
		
		FileWriter fileWriter = new FileWriter(outputFile);
		
		StringBuffer linea = new StringBuffer("Id;Descripción;Precio;Código" + "\n");
		
		//escribo la primer linea del archivo
		
		fileWriter.write(linea.toString());
		
		//cada producto lo convierto a String
		
		for (Producto producto : listado) {
			
			//obtengo el String dado el objeto
			
			String lineaCSV = getStringFromProducto(producto);
			
			fileWriter.write(lineaCSV);
			
		}
		
		fileWriter.close();
		
		//descargar el archivo generado
		
		//seteamos para el navegador el tipo de contenido que queremos que descargue
		
		resp.setContentType("text/csv");
		
		//le agregamos una cabecera al archivo para que lo lea el usuario/navegador.
		//en este caso es una cabecera de tipo "content disposition" que le dice al navegador
		//que genere un attachment del tipo file y con ese nombre.
		
		resp.setHeader("Content-Disposition", "attachment; filename=\"Listado-producto.error.csv\"");
		
		try {
			
			// el OutputStream se utiliza para escribir bytes en un response
			OutputStream out = resp.getOutputStream();
			out.write(Files.readAllBytes(outputFile.toPath()));
			
			out.close();
			
			//el método flush que termina de ejecutar todo lo que concatenó en el Output
			
			out.flush();
			
			outputFile.delete();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		}
		
	}

	private String getStringFromProducto(Producto producto) {
		
		StringBuffer linea = new StringBuffer("");
		
		linea.append(producto.getId() != null ? producto.getId() : "");
		
		linea.append(";");
		
		linea.append(producto.getDescripcion()).append(";");
		
		linea.append(producto.getPrecio()).append(";");
		
		linea.append(producto.getCodigo()).append("\n");
		
		return linea.toString();
		
	}

}
