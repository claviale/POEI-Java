package bll;

import dal.ConnexionDAO;

public class ConnexionBLL {
	private  ConnexionDAO dao = new ConnexionDAO();
	
	public void testConnexion() {
		dao.testConnexion();
	}
}
