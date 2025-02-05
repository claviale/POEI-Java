package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class DeconnexionServlet
 */
@WebServlet("/deconnexion")
public class DeconnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupérer la session et la détruire
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        
        // Supprimer le cookie "username" s'il existe
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    cookie.setMaxAge(0);  // Expirer le cookie
                    response.addCookie(cookie);  // Ajouter à la réponse pour supprimer le cookie
                }
            }
        }
        
        response.sendRedirect("connexion");
    }
}
