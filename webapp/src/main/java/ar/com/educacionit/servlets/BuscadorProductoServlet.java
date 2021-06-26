package ar.com.educacionit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

@WebServlet("/buscarProducto")

public class BuscadorProductoServlet extends HttpServlet{

	private static final long serialVersionUID = 9149842349530447373L;
	
	private ProductoService psi = new ProductoServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String codigo = req.getParameter("codigo");
		
		Collection<Producto> productos = new ArrayList<Producto>();
		
		try {
			
			Producto producto = psi.obtenerProductoPorCodigo(codigo);
			
			if(producto != null) {
						
			productos.add(producto);
			
			}
			
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
		
		//session
		
		HttpSession session = req.getSession();
		
		session.setAttribute("productos", productos);
		
		//dispatcher
		
		RequestDispatcher rd = req.getRequestDispatcher("/resultadosBusqueda.jsp");
		
		rd.forward(req, resp);
		
	}

}
