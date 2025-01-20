package m3LaCreationDeClasse.apprendreALire;

public class CreerUnLivre {
	public static void main(String[] args) {
		/*
		 * Créez la classe Livre. Un Livre est caractérisé par : 
		 *  - un titre (String)
		 *  - un nombre de page (int)
		 *  - un tableau de pages (String[])
		 *  
		 * Lors de l'instanciation, le tableau de page doit être créé avec le bon nombre de page (!)
		 * 
		 * Un Livre dispose des méthodes suivantes :
		 *  - ajouterPage(String) : void --> ajoute une page au Livre (vous pouvez vous inspirer des ajouterCreneau, en plus facile)
		 *  - consulterPage(int) : String --> retourne le texte de la page d'index passé en paramètre
		 *  - toString() --> retourne l'intégralité des informations du livre
		 *  
		 *  Instanciez ensuite un livre, ajoutez-y des pages avant de le lire
		 *  (si vous n'avez pas d'inspiration pour le texte, je vous invite à regarder ce qu'est un lorem ipsum)
		 */
		
		Livre livre = new Livre("Lorem ipsum oui", 3);
		livre.ajouterPage("Oui oui oui");
		livre.ajouterPage("Oui non non");
		livre.ajouterPage("Non non non");
		
		System.out.println(livre.toString());
	}
}
