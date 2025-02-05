package bll;

import bo.Utilisateur;
import dal.UtilisateurDAO;

public class UtilisateurBLL {
	private  UtilisateurDAO dao = new UtilisateurDAO();
	
	public Utilisateur selectByUsername(String username) {
		return dao.selectByUsername(username);
	}
}


