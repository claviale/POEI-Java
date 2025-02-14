package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bll.FilmBLL;
import entities.Film;

/**
 * Servlet implementation class SupprimeFilmServlet
 */
@WebServlet("/supprimer")
public class SupprimeFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmBLL filmBLL = new FilmBLL();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pId = request.getParameter("index").substring(1);
		Film filmToDelete = filmBLL.selectById(Integer.parseInt(pId));
		
		filmBLL.delete(filmToDelete);
		
		response.sendRedirect("lister");
	}


}
