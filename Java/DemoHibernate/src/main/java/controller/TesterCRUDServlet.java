package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import bll.UserBLL;
import bo.User;

/**
 * Servlet implementation class TesterCRUDServlet
 */
@WebServlet("/testerCRUD")
public class TesterCRUDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBLL bll = new UserBLL();
		
		User u1 = new User("tintin", "tintin");
		User u2 = new User("M2i", "formation");
		User u3 = new User("Administrateur", "administrateur");
		
		bll.insert(u1);
		bll.insert(u2);
		bll.insert(u3);
		
		u1.setPassword("milou");
		bll.update(u1);
		
		bll.delete(u2);
		
		List<User> users = bll.select();
		System.out.println(users);
		
	}
}
