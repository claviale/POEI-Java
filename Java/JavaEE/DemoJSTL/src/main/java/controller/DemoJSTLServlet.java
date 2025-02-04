package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoJSTLServlet
 */
@WebServlet("/jstl")
public class DemoJSTLServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> personnages = Arrays.asList("Tintin", "Astérix", "Lanfeust");
		
		Random rand = new Random();
		
		request.setAttribute("piece", rand.nextInt(0, 2));
		request.setAttribute("personnages", personnages);
		request.getRequestDispatcher("/WEB-INF/jsp/personnages.jsp").forward(request, response);
	}



}
