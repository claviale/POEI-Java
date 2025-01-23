package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class TestConnexionBDD {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			DataSource datasource = (DataSource)context.lookup("java:comp/env/admin");
			Connection cnx = datasource.getConnection();
			
			if(!cnx.isClosed()) {
				System.out.println("Connexion réussie");
			}
			cnx.close();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();		
		}
	}
}
