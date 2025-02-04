package bll;

import java.time.LocalDate;
import java.util.List;

import bo.Contact;
import dal.ContactDAO;

public class ContactBLL {
	private  ContactDAO dao = new ContactDAO();
	
	public List<Contact> select() {
		return dao.select();
	}
	
	public List<Contact> selectByNomOrPrenom(String filtre) {
		return dao.selectByNomOrPrenom(filtre);
	}
	
	
	public Contact select(int id) {
		return dao.select(id);
	}
	
	public Contact insert(String nom, String prenom, LocalDate dateNaissance, String numTelephone, String urlReseau, String nomPoste, String specialite) {
		
		Contact contact =  new Contact(nom, prenom, dateNaissance, numTelephone, urlReseau, nomPoste, specialite);
		checkContactInsert(contact);
		dao.insert(contact);
		return contact;
	}

	private void checkContactInsert(Contact contact) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(Contact contact) {
		dao.update(contact);
	}
	
	public void delete(int id) {
		dao.delete(id);
	}
}
