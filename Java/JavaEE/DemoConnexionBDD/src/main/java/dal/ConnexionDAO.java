package dal;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnexionDAO {
	public void testConnexion() {
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/admin");
			Connection cnx = ds.getConnection();
			
			
			if (!cnx.isClosed()) {
				System.out.println("It works ! ");
			} else {
				System.out.println("It not works!");
			}
			
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
