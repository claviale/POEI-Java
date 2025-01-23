package m4LesAssociations.restaurant;

import java.util.ArrayList;
import java.util.List;

import m4LesAssociations.philateliste.Timbre;

public class TesterRestaurant {
	public static void main(String[] args) {
		/*
		 * Créez les classes Restaurant et Fournisseur
		 * Un Restaurant est caractérisé par : 
		 *  - un nom
		 *  - une multitude de fournisseurs
		 *  
		 * Un Fournisseur est caractérisé par : 
		 *  - un nom
		 *  - une multitude de restaurants
		 * 
		 * Chaque classe dispose d'une méthode toString
		 * Chaque classe dispose de getters et de setters
		 * 
		 * Pour vous simplifier le traitement, on considère qu'un restaurant a maximum 10 fournisseurs,
		 * et qu'un fournisseur fourni un maximum de 10 restaurants.
		 * 
		 * Testez ensuite vos classes en créant plusieurs restaurants et plusieurs fournisseurs
		 */
		
		Fournisseur ferme = new Fournisseur("La ferme fruitière");
		Fournisseur picard = new Fournisseur("Picard");
		Fournisseur charal = new Fournisseur("Charal");
		Fournisseur boucher = new Fournisseur("Le boucher du coin");
		Fournisseur superu = new Fournisseur("Super U");
		Fournisseur gourmet = new Fournisseur("Grossiste gourmet");
		
		Restaurant pourri = new Restaurant("Le restau des gros nazes");
		Restaurant moyen = new Restaurant("La cabane a frites");
		Restaurant deluxe = new Restaurant("La Cigale");
		
		pourri.ajouterFournisseur(superu);
		pourri.ajouterFournisseur(picard);
		superu.ajouterRestaurant(pourri);
		picard.ajouterRestaurant(pourri);
		
		moyen.ajouterFournisseur(superu);
		moyen.ajouterFournisseur(boucher);
		moyen.ajouterFournisseur(ferme);
		superu.ajouterRestaurant(moyen);
		boucher.ajouterRestaurant(moyen);
		ferme.ajouterRestaurant(moyen);
		
		deluxe.ajouterFournisseur(gourmet);
		deluxe.ajouterFournisseur(charal);
		deluxe.ajouterFournisseur(ferme);
		gourmet.ajouterRestaurant(deluxe);
		charal.ajouterRestaurant(deluxe);
		ferme.ajouterRestaurant(deluxe);
		
		System.out.println("*** deluxe ***");
		System.out.println(deluxe);
		
		System.out.println("*** moyen ***");
		System.out.println(moyen);
		
		System.out.println("*** pourri ***");
		System.out.println(pourri);

		
	}
}
