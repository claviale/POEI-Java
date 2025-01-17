package bo;

import java.time.LocalDate;

public class Gyropode extends Cycle{
	protected int autonomie;
	protected String tailleMin;
	
	public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, String tailleMin) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie;
		this.tailleMin = tailleMin;
	}
	
	@Override
	public double getTarif(double tarif) {
		return tarif;
	}
	
	public int getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}

	public String getTailleMin() {
		return tailleMin;
	}

	public void setTailleMin(String tailleMin) {
		this.tailleMin = tailleMin;
	}
	
	@Override
	public String toString() {
		return "Gyropode "
				+ marque + " "
				+ modele + " :………………………………………………… " + getTarif(29.90) + "€/heure"
				+ "\n\t"
				+ "•  Acheté le " + dateAchat
				+ "\n\t"
				+ "•  " + autonomie + " km d'autonomie"
				+ "\n\t"
				+ "•  Taille minimum : " + tailleMin;
	}

	
	
	
}
