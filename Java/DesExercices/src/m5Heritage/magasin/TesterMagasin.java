package m5Heritage.magasin;

import m5Heritage.magasin.Clavier.Disposition;

public class TesterMagasin {
	public static void main(String[] args) {
		/*
		 * Créez 4 classes : Magasin, Article, Ecran, Clavier
		 * Un Article dispose des attributs suivants : 
		 *  - un nom
		 *  - une quantite
		 *  - un prix
		 *  
		 * Un Ecran est un Article, et dispose en plus des attributs : 
		 *  - une taille en pouce
		 *  - une résolution (String)
		 *  
		 * Un Clavier est un Article, et dispose en plus de l'attribut : 
		 *  - une dispostion (azerty ou qwerty)
		 *  
		 * Un Magasin dispose des attributs suivants : 
		 *  - un nom
		 *  - une collection d'articles
		 *  
		 * Chaque classe dispose d'un toString, de getters et de setters
		 * La classe Magasin met également a disposition une méthode permettant d'ajouter un article à sa collection
		 * 
		 * Créez un magasin, plusieurs articles, et affichez votre magasin pour constater le bon fonctionnement
		 * de votre application
		 */
		
		Magasin magasin = new Magasin("LDLC");
		
		Article article1 = new Clavier("Ducky channel matcha", 40, 25.99f, Disposition.AZERTY);
		Article article2 = new Clavier("Ducky channel matcha TKL", 35, 20.99f, Disposition.AZERTY);
		Article article3 = new Ecran("ASUS 27", 40, 180.80f, 27, "Ultra HD");
		Article article4 = new Ecran("ASUS 24", 30, 150.80f, 24, "HD");
		
		magasin.ajouterArticle(article1);
		magasin.ajouterArticle(article2);
		magasin.ajouterArticle(article3);
		magasin.ajouterArticle(article4);
		
		System.out.println(magasin.toString().replace("[", "").replace("]", ""));
		
	}
}
