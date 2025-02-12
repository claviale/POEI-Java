package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import bll.StyleBLL;
import entities.Style;

/**
 * Servlet implementation class ListeStylesServlet
 */
@WebServlet("/listerStyle")
public class ListeStylesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StyleBLL styleBLL = new StyleBLL();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Style> styles = styleBLL.select();
		request.setAttribute("listeS", styles);
		
		request.getRequestDispatcher("/WEB-INF/jsp/listeStyles.jsp").forward(request, response);
	}
	
	

	

}
