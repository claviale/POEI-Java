package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bo.Utilisateur;

public class UtilisateurDAO {
	private static final String SELECT_BY_USERNAME =  "SELECT * FROM utilisateurs WHERE username = ?";
	
	public Utilisateur selectByUsername(String username) {
		Utilisateur utilisateur = null;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement ps = cnx.prepareStatement(SELECT_BY_USERNAME);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery(); 
				
			while (rs.next()) {
				utilisateur = convertResultSetToUtilisateur(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return utilisateur;
	}
	
	private Utilisateur convertResultSetToUtilisateur(ResultSet rs) throws SQLException {
		Utilisateur  utilisateur = new Utilisateur();
		utilisateur.setId(rs.getInt("id"));
		utilisateur.setUsername(rs.getString("username"));
		utilisateur.setPassword(rs.getString("password"));

		return utilisateur;
	}
}
