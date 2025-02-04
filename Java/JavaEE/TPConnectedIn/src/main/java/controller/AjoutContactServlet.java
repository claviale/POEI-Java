package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import bll.ContactBLL;
import bo.Contact;

/**
 * Servlet implementation class AjoutContactServlet
 */
@WebServlet("/AjoutContact")
public class AjoutContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ContactBLL contactBLL = new ContactBLL();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("action", "AjoutContact");
		request.getRequestDispatcher("/WEB-INF/jsp/formulaire.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String dateNaissanceStr = request.getParameter("dateNaissance");
		LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr);
		String telephone = request.getParameter("telephone");
		String urlReseau = request.getParameter("urlReseau");
		String poste = request.getParameter("poste");
		String specialite = request.getParameter("specialite");
		
		Contact contact = contactBLL.insert(nom, prenom, dateNaissance, telephone, urlReseau, poste, specialite);
		
		//Deux choix,  premier :
		//request.setAttribute("contact", contact);
		//request.getRequestDispatcher("/WEB-INF/jsp/afficheContact.jsp").forward(request, response);
		//Deuxième : ok pour INSERT car pas multiples insert si F5
		response.sendRedirect("contacts?id=" + contact.getId());
	}

}
