package atelier1.calculatrice;

public class Calculatrice {
	public int additionner(int a, int b) {
		int resultat = a;
		for (int i = 0; i < b; i++) {
			resultat++;
		}
		return resultat;
	}
	
	public int soustraire(int a, int b) {
		int resultat = a;
		for (int i = 0; i < b; i++) {
			resultat--;
		}
		return resultat;
	}
	
	public int multiplier(int a, int b) {
		int resultat = 0;
		for (int i = 0; i < b; i++) {
			resultat = additionner(resultat, a);
		}
		return resultat;
	}
	
	public int diviser(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division par zero impossible");
		}
		int signe = 1;
		if (b < 0) {
			signe = -signe;
			b = -b;
		}
		if (a < 0) {
			signe = -signe;
			a = -a;
		}
		
		int resultat = 0;
		while (a > b) {
			resultat++;
			a = soustraire(a, b);
		}
		return signe * resultat;
	}
	
	public int modulo(int a, int b) {
		int division = diviser(a, b);
		int multipleLePlusProche = b * division;
		return a - multipleLePlusProche;
	}
}
