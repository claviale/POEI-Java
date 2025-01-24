package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bo.Employe;

public class EmployeDAO {
	
	public List<Employe> select() {
		List<Employe> employes = new ArrayList<>();
		
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=employes;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				
				PreparedStatement ps = cnx.prepareStatement("SELECT * FROM employes");
				ResultSet rs = ps.executeQuery(); // pour exécuter un SELECT
				
				while (rs.next()) {
					employes.add(convertResultSetToEmploye(rs));
				}
			}
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
		
		return employes;
	}
	
	public void insert(Employe employe) {
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=employes;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				PreparedStatement ps = cnx.prepareStatement(
						"INSERT INTO employes (nom, prenom, date_naissance, date_embauche, salaire, id_service)"
						+ "VALUES (?, ?, ?, ?, ?, 'RESHU')", PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, employe.getNom());
				ps.setString(2, employe.getPrenom());
				ps.setDate(3, Date.valueOf(employe.getDateNaissance()));
				ps.setDate(4, Date.valueOf(employe.getDateEmbauche()));
				ps.setFloat(5, employe.getSalaire());
				
				ps.executeUpdate(); // pour exécuter INSERT, UPDATE ou DELETE
				
				// Récupérer l'id généré auto lors de l'insert
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					employe.setId(rs.getInt(1));
				}
			}
			
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
	}
	
	public void update(Employe employe) {
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=employes;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				PreparedStatement ps = cnx.prepareStatement(
						"UPDATE employes SET nom = ?, prenom = ?, date_naissance = ?, date_embauche = ?, salaire = ? WHERE id = ?");
				ps.setString(1, employe.getNom());
				ps.setString(2, employe.getPrenom());
				ps.setDate(3, Date.valueOf(employe.getDateNaissance()));
				ps.setDate(4, Date.valueOf(employe.getDateEmbauche()));
				ps.setFloat(5, employe.getSalaire());
				ps.setInt(6, employe.getId());
				
				ps.executeUpdate(); // pour exécuter INSERT, UPDATE ou DELETE
			}
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
	}
	
	public void delete(int id) {
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=employes;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				PreparedStatement ps = cnx.prepareStatement("DELETE FROM employes WHERE id=?");
				ps.setInt(1, id);
				ps.executeUpdate();
			}
			
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
	}

	private Employe convertResultSetToEmploye(ResultSet rs) throws SQLException {
		Employe employe = new Employe();
		employe.setId(rs.getInt("id"));
		employe.setNom(rs.getString("nom"));
		employe.setPrenom(rs.getString("prenom"));
		if (rs.getDate("date_naissance") != null)
			employe.setDateNaissance(rs.getDate("date_naissance").toLocalDate());
		if (rs.getDate("date_embauche") != null)
			employe.setDateEmbauche(rs.getDate("date_embauche").toLocalDate());
		employe.setSalaire(rs.getFloat("salaire"));
		
		return employe;
	}
}
