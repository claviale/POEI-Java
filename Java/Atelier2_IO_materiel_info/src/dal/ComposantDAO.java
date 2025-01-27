package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bo.Composant;

public class ComposantDAO {
	public List<Composant> select() {
		List<Composant> composants = new ArrayList<>();
		
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=MATERIEL_INFO;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				
				PreparedStatement ps = cnx.prepareStatement("SELECT * FROM composants");
				ResultSet rs = ps.executeQuery(); // pour exécuter un SELECT
				
				while (rs.next()) {
					composants.add(convertResultSetToComposant(rs));
				}
			}
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
		
		return composants;
	}
	
	public Composant select(int id) {
		Composant composant = null;
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=MATERIEL_INFO;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				
				PreparedStatement ps = cnx.prepareStatement("SELECT * FROM composants WHERE id = ?");
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery(); // pour exécuter un SELECT
				
				while (rs.next()) {
					composant = convertResultSetToComposant(rs);
				}
			}
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
		
		return composant;
	}
	
	public void insert(Composant composant) {
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=MATERIEL_INFO;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				PreparedStatement ps = cnx.prepareStatement(
						"INSERT INTO composants (nom, nature, date_sortie) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, composant.getNom());
				ps.setString(2, composant.getNature());
				ps.setDate(3, Date.valueOf(composant.getDateSortie()));
				
				ps.executeUpdate(); // pour exécuter INSERT, UPDATE ou DELETE
				
				// Récupérer l'id généré auto lors de l'insert
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					composant.setId(rs.getInt(1));
				}
			}
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
	}
	
	public void update(Composant composant) {
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=MATERIEL_INFO;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				PreparedStatement ps = cnx.prepareStatement(
						"UPDATE composants SET nom = ?, nature = ?, date_sortie = ? WHERE id = ?");
				ps.setString(1, composant.getNom());
				ps.setString(2, composant.getNature());
				ps.setDate(3, Date.valueOf(composant.getDateSortie()));
				ps.setInt(4, composant.getId());
				
				ps.executeUpdate(); // pour exécuter INSERT, UPDATE ou DELETE
			}
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
	}
	
	public void delete(int id) {
		try {
			Connection cnx = DriverManager.getConnection("jdbc:sqlserver://ROGERPC;databasename=MATERIEL_INFO;username=clara;password=clara;trustservercertificate=true");
			
			if(!cnx.isClosed()) {
				PreparedStatement ps = cnx.prepareStatement("DELETE FROM composants WHERE id=?");
				ps.setInt(1, id);
				ps.executeUpdate();
			}
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
	}

	private Composant convertResultSetToComposant(ResultSet rs) throws SQLException {
		Composant composant = new Composant();
		composant.setId(rs.getInt("id"));
		composant.setNom(rs.getString("nom"));
		composant.setNature(rs.getString("nature"));
		if (rs.getDate("date_sortie") != null)
			composant.setDateSortie(rs.getDate("date_sortie").toLocalDate());
		
		return composant;
	}
}
