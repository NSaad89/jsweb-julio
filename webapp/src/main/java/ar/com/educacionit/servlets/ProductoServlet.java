package ar.com.educacionit.servlets;

import java.io.IOException;
import java.util.Collection;

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

@WebServlet("/productoServlet")
public class ProductoServlet extends HttpServlet{
	
	private ProductoService ps = null;

	public ProductoServlet() {
		System.out.println("Creando producto servlet...");
		ps = new ProductoServiceImpl();
		System.out.println("producto servlet creado");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Obtener los productos
		
				try {
					
					Collection<Producto> productos = ps.obtenerTodosProductos();
					
					// Guardamos en el request
					
					req.setAttribute("productos", productos);
					
					RequestDispatcher rd = req.getRequestDispatcher("producto.jsp");
					
					rd.forward(req, resp);
					
				} catch (ServiceException e) {
					
					e.printStackTrace();
					
				}
		
	}

}
