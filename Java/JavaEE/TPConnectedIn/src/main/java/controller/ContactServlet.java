package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bll.ContactBLL;


/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/contacts")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		ContactBLL contactBLL = new ContactBLL();

		request.setAttribute("contact", contactBLL.select(id));
		request.getRequestDispatcher("/WEB-INF/jsp/afficheContact.jsp").forward(request, response);

	}
}
