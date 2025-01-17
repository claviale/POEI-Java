package bo;

import java.time.LocalDate;

public class Velo extends Cycle {
	protected int nbVitesses;
	
	public Velo(String marque, String modele, LocalDate dateAchat, int nbVitesses) {
		super(marque, modele, dateAchat);
		this.nbVitesses = nbVitesses;
	}
	
	@Override
	public double getTarif(double tarif) {
		return tarif;
	}
	
	
	public int getNbVitesses() {
		return nbVitesses;
	}

	public void setNbVitesses(int nbVitesses) {
		this.nbVitesses = nbVitesses;
	}

	@Override
	public String toString() {
		return "Vélo "
				+ marque + " "
				+ modele + " :………………………………………………… " + getTarif(4.90) + "€/heure"
				+ "\n\t"
				+ "•  Acheté le " + dateAchat
				+ "\n\t"
				+ "•  " + nbVitesses + " vitesses";
	}

	
}
