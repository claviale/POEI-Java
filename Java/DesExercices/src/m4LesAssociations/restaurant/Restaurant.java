package m4LesAssociations.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Restaurant {
	private String nom;
	private List<Fournisseur> fournisseurs = new ArrayList<Fournisseur>();
	
	public Restaurant(String nom) {
		this.nom = nom;
	}
	
	public void ajouterFournisseur(Fournisseur fournisseur) {
		fournisseurs.add(fournisseur);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}

	public void setFournisseurs(List<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}

	@Override
	public String toString() {
		return "Restaurant : " 
				+ nom
				+ "\n"
				+"Fournisseurs : " 
				+ fournisseurs;

	}
	
	
	
}
