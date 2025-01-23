package m4LesAssociations.philateliste;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.stream.MemoryCacheImageOutputStream;

public class TesterPhilateliste {
	public static void main(String[] args) {
		/*
		 * Créez deux classes, Timbre et Philateliste
		 * Un Timbre a un nom et une valeur
		 * 
		 * Un Philateliste a : 
		 *  - un nom
		 *  - un prenom
		 *  - une collection de Timbre
		 * 
		 * Chaque classe dispose d'une méthode toString
		 * Chaque classe dispose de getters et de setters
		 * Vous êtes libres de créer des méthodes supplémentaires si vous le jugez utile
		 * 
		 * Créez un philatéliste et affectez-lui des timbres, puis, affichez-le pour
		 * constater le bon fonctionnement de votre programme
		 */
		
		//Créer les timbres
		Timbre timbre1 = new Timbre("Pologne 2024" , 24);
		Timbre timbre2 = new Timbre("France Tour Eiffel" , 10);
		Timbre timbre3 = new Timbre("Balade en vélo" , 150);
		
		//Créer la collection de timbres et affecter les timbres
		List<Timbre> collectionTimbres = new ArrayList<Timbre>();
		collectionTimbres.add(timbre1);
		collectionTimbres.add(timbre2);
		collectionTimbres.add(timbre3);
		
		//Créer le philateliste et ajouter la collection de timbres
		Philateliste philateliste1 = new Philateliste("Durand", "Antoine");
		
		philateliste1.setTimbres(collectionTimbres);
		
		//Affiche la collection
		System.out.println(collectionTimbres);
		System.out.println(philateliste1.getTimbres());
		
		//Affiche les informations du philateliste (+collection)
		System.out.println(philateliste1.toString());
	}
}
