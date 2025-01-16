package bo;

public class MedecinSpecialiste extends Medecin {
	private int tarif;
	private String specialite;
	
	public MedecinSpecialiste(String lastName, String firstName, String phoneNumber, Adresse adress, int tarif, String specialite) {
		super(lastName, firstName, phoneNumber, adress);
		this.tarif = tarif;
		this.specialite = specialite;
	}
	
	@Override
	public int recupererTarif() {
		return tarif;
	}
	
	public int getTarif() {
		return tarif;
	}
	
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	
	public String getSpecialite() {
		return specialite;
	}
	
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "MedecinSpecialiste [tarif=" + tarif + ", specialite=" + specialite + ", lastName=" + lastName
				+ ", firstName=" + firstName + ", phoneNumber=" + phoneNumber + ", adress=" + adress + "]";
	}
	
}
