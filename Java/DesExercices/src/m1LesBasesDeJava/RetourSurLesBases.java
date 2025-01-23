package m1LesBasesDeJava;

import java.util.Scanner;

public class RetourSurLesBases {
	
	public static void main(String[] args) {
		exercice1();
		exercice2();
		exercice3();
		exercice4();
	}

	private static void exercice1() {
		/*
		 * facile
		 * Créez une fonction qui prend deux entiers en paramètre
		 * et restitue leur somme
		 */
		System.out.println(somme(1, 2));
		
	}
	
	private static int somme(int a, int b) {
		return a + b;
	}
	
	private static void exercice2() {
		/*
		 * moyen
		 * créez une fonction qui prend un tableau en paramètre
		 * et qui affiche chacun de ses éléments à la ligne
		 */
		int[] tableau = {5, 8, 4, 9, 2, 1, 7};
		afficherTableau(tableau);
		
	}
	
	private static void afficherTableau(int[] tableau) {
		for (int elem : tableau) {
			System.out.println(elem);
		}
	}
	
	private static void exercice3() {
		/*
		 * moyen
		 * créez une fonction qui prend un tableau en paramètre
		 * et qui double toutes les valeurs de ce tableau
		 * Vous pouvez utiliser la fonction créée à l'exercice 2
		 * pour consulter les valeurs
		 */
		int[] tableau = {5, 8, 4, 9, 2, 1, 7};
		doublerTableau(tableau);
		afficherTableau(tableau);
	}
	
	private static void doublerTableau(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = tableau[i] * 2;
		}
	}
	
	private static void exercice4() {
		/*
		 * corsé
		 * Créez une fonction qui prend deux entiers en paramètre
		 * et restitue la puissance de l'un par rapport à l'autre
		 * Par exemple : puissance(5, 2) --> 5² = 25
		 */
		System.out.println(puissance(5,2));
	}
	
	private static double puissance(int nb1, int nb2) {
		return Math.pow(nb1, nb2);
	}	
}
