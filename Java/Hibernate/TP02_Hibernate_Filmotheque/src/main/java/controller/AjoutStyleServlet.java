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
 * Servlet implementation class AjoutStyleServlet
 */
@WebServlet("/ajouterStyle")
public class AjoutStyleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StyleBLL styleBLL = new StyleBLL();
		
		Style style = new Style(request.getParameter("libelle"));
		styleBLL.insert(style);
		
		response.sendRedirect("listerStyle");
	}

}
