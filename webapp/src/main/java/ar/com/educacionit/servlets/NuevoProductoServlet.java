package ar.com.educacionit.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.crypto.spec.PSource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

@WebServlet("/nuevoProducto")

public class NuevoProductoServlet extends HttpServlet {
	
	private ProductoService ps;
		
	public NuevoProductoServlet() {
		
		System.out.println("Creando " + getClass().getSimpleName());
		
		ps = new ProductoServiceImpl();
		
		System.out.println("Creado " + getClass().getSimpleName() + " OK!!");
		
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String descripcion = req.getParameter("descripcion");
		
		String precio = req.getParameter("precio");
		
		String codigo = req.getParameter("codigo");
		
		//validacion
		
		boolean hasError = false;
		
		if(descripcion == null || descripcion.isEmpty()) {
			
			req.setAttribute("errorDescripcion", "Debe insertar una descripción válida");
			
			hasError = true;
			
		}
		
		if(precio == null || precio.isEmpty()) {
			
			req.setAttribute("errorPrecio", "Debe insertar un precio válido");

			hasError = true;
			
		}
		
		if(codigo == null || codigo.isEmpty()) {
			
			req.setAttribute("errorCodigo", "Debe insertar un codigo válido");
			
			hasError = true;
			
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/nuevoProducto.jsp");
				
				if(hasError) {
					
					rd.forward(req, resp);
					
				} else {
					
					Producto nuevoProducto = new Producto(descripcion, Float.parseFloat(precio), codigo);
					
					try {
						
						ps.crearProducto(nuevoProducto);
						
						rd = req.getRequestDispatcher("/buscarProducto");
						
					} catch (ServiceException e) {
						
						e.printStackTrace();
						
						req.setAttribute("errorGeneral", e.getMessage());
						
						rd = req.getRequestDispatcher("/nuevoProducto.jsp");
						
					}finally {
						
						rd.forward(req, resp);
						
					}
					
				}
		
	}

}
