package bll;

import java.time.LocalDate;
import java.util.List;

import bo.Composant;
import dal.ComposantDAO;
import exceptions.ComposantException;


public class ComposantBLL {
	public List<Composant> select() {
		ComposantDAO dao = new ComposantDAO();
		return dao.select();
	}
	
	public Composant insert(String nom, String nature, LocalDate dateSortie) throws ComposantException {
		Composant composant = new Composant(nom, nature, dateSortie);
		checkComposant(composant);
		
		ComposantDAO dao = new ComposantDAO();
		dao.insert(composant);
		
		return composant;
	}
	
	public void update(Composant composant) throws ComposantException {
		checkComposant(composant);
		
		ComposantDAO dao = new ComposantDAO();
		dao.update(composant);
	}
	
	private void checkComposant(Composant composant) throws ComposantException  {

		if (composant.getNom() == null || composant.getNom().length() < 2 || composant.getNom().length() > 50) {
			throw new ComposantException("Le nom doit faire entre 2 et 20 caractères.");
		}
	}
	
	public void delete(int id) {
		ComposantDAO dao = new ComposantDAO();;
		dao.delete(id);
	}
}
