package bo;

import java.time.LocalDate;

public class Gyroroue extends Cycle{
	protected int autonomie;

	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie;
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
	
	@Override
	public String toString() {
		return "Gyroroue "
				+ marque + " "
				+ modele + " :………………………………………………… " + getTarif(18.90) + "€/heure"
				+ "\n\t"
				+ "•  Acheté le " + dateAchat
				+ "\n\t"
				+ "•  " + autonomie + " km d'autonomie";
	}
	
	
}
