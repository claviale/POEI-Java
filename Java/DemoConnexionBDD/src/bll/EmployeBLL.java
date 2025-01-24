package bll;

import java.time.LocalDate;
import java.util.List;

import bo.Employe;
import dal.EmployeDAO;
import exceptions.EmployeException;

public class EmployeBLL {
	private static final float SMIC = 1801.80F;
	
	public List<Employe> select() {
		EmployeDAO dao = new EmployeDAO();
		return dao.select();
	}
	
	// Pour avoir le droit de réaliser l'insertion, un employé doit respecter les contraintes suivantes :
	// - Nom et prénom compris entre 2 et 20 caractères
	// - dateNaissance antérieure à dateEmbauche
	// - salaire supérieur ou égal au SMIC
	
	public Employe insert(String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, float salaire) throws EmployeException {
		Employe employe = new Employe(nom, prenom, dateNaissance, dateEmbauche, salaire);
		checkEmploye(employe);
		
		EmployeDAO dao = new EmployeDAO();
		dao.insert(employe);
		
		return employe;
	}
	
	public void update(Employe employe) throws EmployeException {
		checkEmploye(employe);
		
		EmployeDAO dao = new EmployeDAO();
		dao.update(employe);
	}
	
	private void checkEmploye(Employe employe) throws EmployeException {

		if (employe.getNom() == null || employe.getNom().length() < 2 || employe.getNom().length() > 20) {
			throw new EmployeException("Le nom doit faire entre 2 et 20 caractères.");
		}
		
		if (employe.getPrenom() == null || employe.getPrenom().length() < 2 || employe.getPrenom().length() > 20) {
			throw new EmployeException("Le prénom doit faire entre 2 et 20 caractères.");
		}
	
		if (employe.getDateNaissance() != null && employe.getDateNaissance().isAfter(employe.getDateEmbauche())) {
			throw new EmployeException("Vous ne pouvez pas embaucher un individu qui n'est pas encore né!");
		}
		
		if (employe.getSalaire() < SMIC) {
			throw new EmployeException("Vous ne pouvez pas sous-payer vos salariés !");
		}	
	}
	
	public void delete(int id) {
		EmployeDAO dao = new EmployeDAO();
		dao.delete(id);
	}
}
