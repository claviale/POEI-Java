package controller;

import java.io.IOException;

import bo.Personne;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DelegationServlet
 */
@WebServlet("/Delegation")
public class DelegationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Traitement de la Servlet
		request.setAttribute("prenom", "Etienne");
		request.setAttribute("age", 32);
		request.setAttribute("bonhomme", new Personne(1, "Toto", 8));
		request.getRequestDispatcher("/WEB-INF/jsp/UneJSPinaccessible.jsp").forward(request, response);
	
		//Attention, tout code après le forward ne fonctionnera pas.
	}

}
