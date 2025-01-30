package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

import javax.management.NotCompliantMBeanException;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreChoix = request.getParameter("nombreChoix");
        System.out.println("Choix de l'utilisateur : " + nombreChoix);
              
        int choix = Integer.parseInt(nombreChoix);
        if (choix >= 0 && choix <= 10) {
	        Random random = new Random();
	        int tirage = random.nextInt(11);
	        System.out.println("Nombre tiré au sort : " + tirage);
	
	
	        if (choix == tirage) {
	        	response.sendRedirect("Victoire.html");
	        } else {
	            response.sendRedirect("Echec.html");
	        }
        } else {
            System.out.println("Erreur : le nombre choisi n'est pas entre 0 et 10.");
            response.sendRedirect("Echec.html");
        }
     }
}
