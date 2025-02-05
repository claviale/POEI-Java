package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import bll.UtilisateurBLL;
import bo.Utilisateur;


/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {
	private static UtilisateurBLL utilisateurBLL = new UtilisateurBLL();
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/connexion.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rememberMe = request.getParameter("rememberMe");
		
		// Récupérer l'utilisateur via le BLL
		Utilisateur utilisateur = utilisateurBLL.selectByUsername(username);
		
        // Vérification du mot de passe
        if (utilisateur != null && utilisateur.getPassword().equals(password)) {
            // Si l'utilisateur est authentifié, enregistrer l'utilisateur dans la session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            
         // Si "Se souvenir de moi" est coché, créer un cookie pour l'utilisateur
            if ("on".equals(rememberMe)) {
                Cookie userCookie = new Cookie("username", username);
                userCookie.setMaxAge(60 * 60 * 24 * 7); // Durée de vie du cookie : 7 jours
                response.addCookie(userCookie);
            }
            // Rediriger vers la page d'accueil
            response.sendRedirect("Accueil");
        } else {
            // Si l'authentification échoue, afficher un message d'erreur
            request.setAttribute("errorMessage", "Identifiant ou mot de passe incorrect.");
            request.getRequestDispatcher("/WEB-INF/jsp/connexion.jsp").forward(request, response);
        }
	}
}
