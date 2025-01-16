package bo;

public class MedecinGeneraliste extends Medecin {
	
	private static int tarif;
	
	public MedecinGeneraliste(String lastName, String firstName, String phoneNumber, Adresse adress) {
		super(lastName, firstName, phoneNumber, adress);
	}
	
	@Override
	public int recupererTarif() {
		return tarif;
	}
	
	public static int getTarif() {
		return tarif;
	}
	
	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

}
