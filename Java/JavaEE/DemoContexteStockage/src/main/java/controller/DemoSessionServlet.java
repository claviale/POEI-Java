package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DemoSessionServlet
 */
@WebServlet("/session")
public class DemoSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupérer une valeur tstockée dans la session
		//String valeur = (String) request.getSession().getAttribute("cle");
		
		// Affecter une valeur dans la session
		request.getSession().setAttribute("cle", "valeur");
		request.getRequestDispatcher("/WEB-INF/jsp/session.jsp").forward(request, response);
	}


}
