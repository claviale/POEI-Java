package bo;

import java.util.ArrayList;
import java.util.List;

public class Medecin extends Personne {
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	
	// constructeur 
	public Medecin(String lastName, String firstName, String phoneNumber, Adresse adress) {
		super(lastName, firstName, phoneNumber, adress);
	}
	
	// methodes
	
	// La méthode recupererTarif n'a pas de sens dans la classe Medecin : elle renvoie donc une valeur absurde
	public int recupererTarif() {
		throw new RuntimeException("On ne devrait pas passer par là");
	}
		
	public void ajouterCreneau(Creneau creneauAAjouter) {
		creneaux.add(creneauAAjouter);
	}
	
	// getters & setters
	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	@Override
	public String toString() {
		String result = "Medecin [nom="
					+ lastName
					+ ", prenom="
					+ firstName
					+ ", tarif="
					+ recupererTarif()
					+ ", telephone="
					+ phoneNumber
					+ ", adresse="
					+ adress;
		
		result += "\nCreneaux :\n";
		for (Creneau current : creneaux) {
			result += " - " + current.getTime() + " (" + current.getDuration() + " minutes)\n";
		}
		
		result += "]";
		return result;
	}
}
