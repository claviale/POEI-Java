package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Ne pas utiliser, juste démo de connexion
 */

public class TestConnexionBDD {
	public static void main(String[] args) {
		try {
			
			//LES LIBRAIRIES
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=PFR;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				System.out.println("Connexion réussie !");
				
				PreparedStatement ps = cnx.prepareStatement("SELECT * FROM roles");
				ResultSet rs = ps.executeQuery(); // pour exécuter un SELECT
				while (rs.next()) {
					System.out.println(rs.getString("id") + " " + rs.getString("libelle"));
					
				}
			}
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
	}
}
