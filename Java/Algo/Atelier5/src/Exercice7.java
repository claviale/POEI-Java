import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		/*
		 * Ecrivez un programme gérant une liste de notes pour une classe. Les notes
		 * sont stockées dans un tableau. Lors de l’exécution, l'algorithme affiche la
		 * moyenne, la note minimum et la note maximum.
		 */
		
		System.out.println("Combien de notes voulez-vous saisir ?");
		Scanner scan = new Scanner(System.in);
		int nbNotes = scan.nextInt();
		int[] notes = new int[nbNotes];
		
		for (int i = 0; i < nbNotes; i++) {
			System.out.println("Veuillez saisir la note n° : " + i);
			notes[i] = scan.nextInt();
		}
		
		scan.close();
		
		System.out.println("*****");
		int somme = 0;
		int plusPetiteNoteTrouvee = 20;
		int plusGrandeNoteTrouvee = 0;
		
		for (int note : notes) {
			somme += note;
			
			if (note < plusPetiteNoteTrouvee) {
				plusPetiteNoteTrouvee = note;			
			}
			
			if (note > plusGrandeNoteTrouvee) {
				plusGrandeNoteTrouvee = note;
			}
		}
		
		int moyenne = somme / nbNotes;
		System.out.println("La moyenne est : " + moyenne);
		System.out.println("La plus petite note est : " + plusPetiteNoteTrouvee);
		System.out.println("La plus grande note est : " + plusGrandeNoteTrouvee);
		
	}

}
