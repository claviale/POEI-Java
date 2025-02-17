package calc;

public class Accumulateur {
	private int valeur;
	
	public void incrementer() {
		valeur++;
	}
	
	public void reinitialiser() {
		valeur = 0;
	}
	
	public int getValeur() {
		return valeur;
	}
}
