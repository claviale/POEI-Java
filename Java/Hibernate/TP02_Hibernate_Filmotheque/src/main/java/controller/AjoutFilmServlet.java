package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bll.FilmBLL;
import bll.FilmException;
import bll.StyleBLL;
import entities.Acteur;
import entities.Film;
import entities.Realisateur;
import entities.Style;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjoutFilmServlet
 */
@WebServlet("/ajouter")
public class AjoutFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StyleBLL styleBLL = new StyleBLL();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Style> styles = styleBLL.select();
		request.setAttribute("listeStyles", styles);
		request.getRequestDispatcher("/WEB-INF/jsp/ajouterFilm.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean insertionOk = true;
		try {
			String titre = request.getParameter("titre");
			int annee = Integer.valueOf(request.getParameter("annee"));
			
			int styleId = Integer.valueOf(request.getParameter("style"));
			Style style = styleBLL.selectById(styleId); 
			
			String realPrenom = request.getParameter("real.prenom");
			String realNom = request.getParameter("real.nom");
			Realisateur realisateur = new Realisateur(realPrenom, realNom);
			
			String dureeStr = request.getParameter("duree");
			int duree = Integer.parseInt(dureeStr);
			
	        String vuStr = request.getParameter("vu"); 
	        boolean vu = Boolean.parseBoolean(vuStr);
	        
	        List<Acteur> acteurs = new ArrayList<>();
	        for (int i = 0; i < 5; i++) { 
	            String prenom = request.getParameter("prenom" + i);
	            String nom = request.getParameter("nom" + i);
	
	            if (prenom != null && nom != null && !prenom.isEmpty() && !nom.isEmpty()) {
	                acteurs.add(new Acteur(prenom, nom));
	            }
	        }
	        
	        String synopsis = request.getParameter("synopsis");
	        
			
			Film film = new Film(titre, annee, duree, vu, synopsis, style, realisateur, acteurs);
			FilmBLL filmBLL = new FilmBLL();
			
			filmBLL.insert(film);
		} catch (FilmException e) {
			insertionOk = false;
			request.setAttribute("erreurs", e.getMessages());
			doGet(request, response);
		} catch (Exception e) { // Les exceptions issues de mauvais Integer.parseInt...
			insertionOk = false;
			List<String> erreurs = new ArrayList<>();
			erreurs.add("L'annee ou la duree ne respecte pas un format de nombre correct");
			request.setAttribute("erreurs", erreurs);
			request.setAttribute("classError", "error_input");
			doGet(request, response);
		}
		if (insertionOk) {
			response.sendRedirect("lister");
		}
	}



}
