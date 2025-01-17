package bo;

import java.time.LocalDate;

public class Gyroroue extends Cycle{
	protected int autonomie;
	private static final float TARIF = 18.90f;

	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie;
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
	
	@Override
	public String toString() {
		return super.toString()
			+ "\n\t•"
			+ autonomie + "km d'autonomie";
	}
	
	
}
