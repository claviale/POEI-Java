package m4LesAssociations.annuaire;

public class TesterAnnuaire {
	public static void main(String[] args) {
		/*
		 * Créez deux classes, Contact et Coordonnees.
		 * Un Contact est caractérisé par : 
		 *  - un nom
		 *  - un prenom
		 *  - une coordonnee
		 * 
		 * Une Coordonnee est caractérisée par : 
		 *  - un numéro de téléphone fixe
		 *  - un numéro de téléphone portable
		 *  - un contact
		 * 
		 * Chaque classe dispose d'une méthode toString permettant de consulter ses attributs
		 * Chaque classe dispose de getters et de setters
		 * 
		 * Créez deux classes et deux coordonnées dans ce main, associez-les, puis, affichez-les pour vous
		 * assurer que vos liens ont bien fonctionné.
		 */
		
		Contact contact1 = new Contact("Cassin", "Etienne");
		Contact contact2 = new Contact("Kamakawiwo'ole", "Israel");
		
		Coordonnees coord1 = new Coordonnees("0212345678", "0612345678");
		Coordonnees coord2 = new Coordonnees("0201020304", "0601020304");
		
		contact1.setCoordonnees(coord1);
		coord1.setContact(contact1);
		
		contact2.setCoordonnees(coord2);
		coord2.setContact(contact2);
		
		System.out.println(contact1.toString());
		System.out.println(contact2.toString());
		
	}
}
