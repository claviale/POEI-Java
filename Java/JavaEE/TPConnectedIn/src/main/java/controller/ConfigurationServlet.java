package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ConfigurationServlet
 */
@WebServlet("/configuration")
public class ConfigurationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer visites = (Integer) request.getSession().getAttribute("visites");
        if (visites == null) {
            visites = 0; 
        }
        visites++;

        request.getSession().setAttribute("visites", visites);
        request.setAttribute("visites", visites);
        
		request.getRequestDispatcher("/WEB-INF/jsp/configuration.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String poste = request.getParameter("poste");
		Cookie cookiePoste = new Cookie("poste", poste);
		response.addCookie(cookiePoste);
		request.setAttribute("message", "La valeur " + poste + " a bien été enregistrée.");
		request.getRequestDispatcher("WEB-INF/jsp/configuration.jsp").forward(request, response);
		
	}
}
