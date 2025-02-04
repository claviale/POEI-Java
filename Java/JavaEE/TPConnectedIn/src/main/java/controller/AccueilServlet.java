package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import bll.ContactBLL;
import bo.Contact;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet("/Accueil")
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ContactBLL contactBLL = new ContactBLL();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String filtre = request.getParameter("filtre");
		
		List<Contact> contacts = contactBLL.select();
		
		if(filtre == null || filtre.isBlank()) {
			request.setAttribute("contacts", contacts);
		} else {
			request.setAttribute("contacts", contactBLL.selectByNomOrPrenom(filtre));
		}
		request.getRequestDispatcher("/WEB-INF/jsp/accueil.jsp").forward(request, response);
		
	}

}
