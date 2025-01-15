package demo_fonctions;

public class DemoPassageValeurVsPassageReference {

	public static void main(String[] args) {
		int monNombre = 4;
		int[] mesNombres = { 5 };
		
		System.out.println(monNombre); //affiche 4
		System.out.println(mesNombres[0]); //affiche 5
		
		changerValeur(monNombre); //do nothing
		changerValeurTableau(mesNombres); //modifie la valeur du tableau
		
		System.out.println(monNombre); //affiche 4
		System.out.println(mesNombres[0]); //affiche 99

	}
	
	//Attention fonction inutile
	public static void changerValeur(int nombreAModifier) {
		nombreAModifier = 99;
	}
	
	public static void changerValeurTableau(int[] tableauAModifier) {
		tableauAModifier[0] = 99;
	}
}
