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
 * Servlet implementation class AfficheFilmServlet
 */
@WebServlet("/afficher")
public class AfficheFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static FilmBLL filmBLL = new FilmBLL();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String indexStr = request.getParameter("index");
		int id = Integer.parseInt(indexStr); 
		Film film = filmBLL.selectById(id);
		
		request.setAttribute("film", film);
		request.getRequestDispatcher("/WEB-INF/jsp/afficherFilm.jsp").forward(request, response);
	}


}
