package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bll.StyleBLL;
import entities.Style;

/**
 * Servlet implementation class SupprimeStyleServlet
 */
@WebServlet("/modifStyle")
public class ModifieStyleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		String libelle = request.getParameter("libelle");
		StyleBLL styleBLL = new StyleBLL();
		
		Style style = styleBLL.selectById(id);
		style.setLibelle(libelle);
		
		styleBLL.update(style);
		
		response.sendRedirect("listerStyle");
	}

}
