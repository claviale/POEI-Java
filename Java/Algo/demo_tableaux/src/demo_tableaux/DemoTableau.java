package demo_tableaux;

import java.util.Random;

public class DemoTableau {

	public static void main(String[] args) {
		
		//Créer tableau de 10 éléments
		int[] notes = new int[10];
		
		Random rand = new Random();
		
		//Assigner des notes random entre 10 et 20 aux 10 éléments
		for (int i = 0; i < notes.length; i++) {
			notes[i] = rand.nextInt(10, 20);
			System.out.println(notes[i]);
		}
		
		//Assigner note de 20 au 8ème élément
		notes[8] = 20;
		
		System.out.println("***********");
		
		//Utilisation d'une boucle for each pour lecture seule
		for (int note : notes) {
			System.out.println(note);
		}
		
		//La note du 9ème élément est bien désormais à 20
		
		//Connaître la moyenne de la classe:
		int somme = 0;
		for (int note : notes) {
			somme += note;
		}
		
		int moyenne = somme / notes.length;
		System.out.println("La moyenne de classe : " + moyenne);
	}

}
