package bo;

import java.time.LocalDate;

public class Velo extends Cycle {
	protected int nbVitesses;
	private static final float TARIF = 4.90f;
	
	public Velo(String marque, String modele, LocalDate dateAchat, int nbVitesses) {
		super(marque, modele, dateAchat);
		this.nbVitesses = nbVitesses;
	}
	
	@Override
	public float getTarif() {
		return TARIF;
	}
	
	public int getNbVitesses() {
		return nbVitesses;
	}

	public void setNbVitesses(int nbVitesses) {
		this.nbVitesses = nbVitesses;
	}

	@Override
	public String toString() {
		return super.toString()
			+ "\n\t• "
			+ nbVitesses + " vitesses";
	}
	
}
