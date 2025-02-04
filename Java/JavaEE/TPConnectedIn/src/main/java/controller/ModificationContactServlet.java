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
 * Servlet implementation class ModificationContactServlet
 */
@WebServlet("/ModificationContact")
public class ModificationContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ContactBLL contactBLL = new ContactBLL();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		Contact contact = contactBLL.select(id);
		
		request.setAttribute("contact", contact);
		request.setAttribute("action", "ModificationContact");
		request.getRequestDispatcher("/WEB-INF/jsp/formulaire.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		LocalDate dateNaissance = LocalDate.parse(request.getParameter("dateNaissance"));
		String telephone = request.getParameter("telephone");
		String urlReseau = request.getParameter("urlReseau");
		String poste = request.getParameter("poste");
		String specialite = request.getParameter("specialite");
		
		Contact contact = contactBLL.select(id);
		contact.setNom(nom);
		contact.setPrenom(prenom);
		contact.setDateNaissance(dateNaissance);
		contact.setNumTelephone(telephone);
		contact.setUrlReseau(urlReseau);
		contact.setNomPoste(poste);
		contact.setSpecialite(specialite);
		
		contactBLL.update(contact);

		response.sendRedirect("contacts?id=" + contact.getId());
	}
}
