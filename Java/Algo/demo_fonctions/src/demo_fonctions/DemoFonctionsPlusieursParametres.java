package demo_fonctions;

public class DemoFonctionsPlusieursParametres {

	public static void main(String[] args) {
		
		float resultat = somme(5.4f, 2.7f);
		System.out.println(resultat);
		
		System.out.println(somme(7, 5));
		
		System.out.println(repeter("Il est l'heure", 10));

	}

	public static float somme(float nb1, float nb2) {
		return nb1 + nb2;
	}
	
	public static String repeter(String chaineARepeter, int repetition) {
		String resultat = "";
		for (int i = 0; i < repetition; i++) {
			resultat += chaineARepeter;
		}
		return resultat;
	}
}
