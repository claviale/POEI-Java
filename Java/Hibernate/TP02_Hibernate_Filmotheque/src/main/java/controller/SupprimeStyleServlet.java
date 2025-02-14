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
@WebServlet("/supprimerStyle")
public class SupprimeStyleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StyleBLL styleBLL = new StyleBLL();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("index");
		int id = Integer.parseInt(idStr);
		
		Style styleToDelete = styleBLL.selectById(id);
		styleBLL.delete(styleToDelete);
		
		response.sendRedirect("listerStyle");
	}

}
