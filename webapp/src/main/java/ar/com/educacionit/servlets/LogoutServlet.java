package ar.com.educacionit.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logoutServlet")

public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 9190365808712184818L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//terminar la session
		
		req.getSession().invalidate();
		
		resp.sendRedirect(req.getContextPath());
	}

}
