package ar.com.educacionit.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.service.UsuarioService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.UsuarioServiceImpl;

@WebServlet("/loginServlet")

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 9190365808712184818L;
	
	private UsuarioService us = new UsuarioServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		try {
			Usuario usuario = us.Login(username, password);
			
			//grabamos en la sesion el usuario
			
			req.getSession().setAttribute("usuario", usuario);
			
			resp.sendRedirect(req.getContextPath());
			
		} catch (ServiceException e) {
			
			req.setAttribute("error", e.getMessage());
			
			resp.sendRedirect(req.getContextPath() + "/error.jsp");
			
		}
		
	}

}
