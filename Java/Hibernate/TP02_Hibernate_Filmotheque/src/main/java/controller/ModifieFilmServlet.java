package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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

/**
 * Servlet implementation class ModifieFilmServlet
 */
@WebServlet("/editer")
public class ModifieFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static FilmBLL filmBLL = new FilmBLL();
	private static StyleBLL styleBLL = new StyleBLL();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// substring(1) permet de passer de "m2" (identifiant) a "2" (je retire le premier caractere)
		String id = request.getParameter("index").substring(1);
		request.setAttribute("film", filmBLL.selectById(Integer.parseInt(id)));
		request.setAttribute("listeStyles", styleBLL.select());
		
		request.getRequestDispatcher("/WEB-INF/jsp/editerFilm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
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
        
        Film film = filmBLL.selectById(id);
        film.setTitre(titre);
        film.setAnnee(annee);
        film.setStyle(style);
        film.setRealisateur(realisateur);
        film.setDuree(duree);
        film.setVu(vu);
        film.setActeurs(acteurs);
        film.setSynopsis(synopsis);
        
        try {
			filmBLL.update(film);
		} catch (FilmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        response.sendRedirect("lister");
	}

}
