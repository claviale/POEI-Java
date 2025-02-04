package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DemoCookiesServlet
 */
@WebServlet("/DemoCookiesServlet")
public class DemoCookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupérer  un cookie
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for  (Cookie current : cookies) {
				if ("theme".equals(current.getName())) {
					System.out.println(current.getValue());
				}
			}
		}
		
		// Ajoute un cookie sur le poste de l'utilisateur
		Cookie monCookie = new Cookie("theme", "dark");
		monCookie.setMaxAge(10); //le cookie espirera au bout de 10sec
		response.addCookie(monCookie);
		
		request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);
	}


}
