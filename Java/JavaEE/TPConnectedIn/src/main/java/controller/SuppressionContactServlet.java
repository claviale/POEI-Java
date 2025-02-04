package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bll.ContactBLL;

/**
 * Servlet implementation class SuppressionContactServlet
 */
@WebServlet("/SuppressionContact")
public class SuppressionContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		ContactBLL contactBLL = new ContactBLL();
		contactBLL.delete(id);

		//request.getRequestDispatcher("/WEB-INF/jsp/accueil.jsp").forward(request, response);
		response.sendRedirect("Accueil");
	}

}
