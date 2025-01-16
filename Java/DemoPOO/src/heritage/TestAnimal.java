package heritage;

import java.util.concurrent.BrokenBarrierException;

public class TestAnimal {
	public static void main(String[] args) {
		Animal ori = new Animal("Ori");
		Herisson sonic = new Herisson("Sonic", 8);
		Renard tails = new Renard("Tails", "Orange");
		Oiseau bipbip = new Oiseau("Bip bip", false);
		Oiseau titi = new Oiseau("Titi", true);
		
		System.out.println(ori.getNom());
		
		System.out.println(sonic.getNom());
		System.out.println(sonic.getNbAiguilles());
		
		System.out.println(tails.getNom());
		System.out.println(tails.getCouleur());
		
		System.out.println(bipbip.getNom());
		System.out.println(bipbip.isVolant());
		
		System.out.println(titi.getNom());
		System.out.println(titi.isVolant());
		
		System.out.println("\n\n\n");
		
		System.out.println(ori);
		System.out.println(sonic);
		System.out.println(tails);
		System.out.println(bipbip);
		System.out.println(titi);
		
		/* Affiche dans la console :
		 	Animal : 
					Ori
			Animal : 
					Sonic
					Nombre d'aiguilles : 8
			Animal : 
					Tails
					Couleur : Orange
			Animal : 
					Bip bip
					Ne peut pas voler
			Animal : 
					Titi
					Est capable de voler
		 */
		
		dessiner(ori);
		dessiner(sonic);
		dessiner(tails);
	}
	
	//transtypage ascendant : je généralise une instance initalement précise
	public static void dessiner(Animal animal) {
		System.out.println("********************");
		System.out.println(animal);
		// transtypage descendant : je pars d'une instance générique (animal) et je la traite comme une instance plus précise (hérisson)
		if (animal instanceof Herisson) {
			Herisson herisson = (Herisson) animal; // un animal devient un hérisson
			//On peut donc récupérer le getNbAiguilles via la classe Animal
			System.out.println("Nombre d'aiguilles : " + herisson.getNbAiguilles());
		}
		
		System.out.println("********************");
		
		
	}
	
}
