package bo;

import java.time.LocalDate;

public class Gyropode extends Cycle{
	protected int autonomie;
	protected int tailleMin;
	private static final float TARIF = 29.90f;
	
	public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, int tailleMin) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie;
		this.tailleMin = tailleMin;
	}
	
	@Override
	public float getTarif() {
		return TARIF;
	}
	
	public int getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}
	public int getTailleMin() {
		return tailleMin;
	}
	
	@Override
	public String toString() {
		
		// double to string 1.60 => 1m60
		// String taille = String.valueOf(tailleMin).replace('.', 'm'); // 1.60
		
		int tailleEnMetre = getTailleMin() / 100;
		int resteEnCentimetre = getTailleMin() % 100;
		return super.toString()
			+ "\n\t• "
			+ autonomie + "km d'autonomie"
			+ "\n\t• "
			+ "Taille minimum : " 
			+ tailleEnMetre
			+ "m"
			+ resteEnCentimetre;
	}

}
