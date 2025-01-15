package bo;

import java.util.ArrayList;
import java.util.List;

public class MedecinGeneraliste {
	
	// attributs
	private String lastName;
	private String firstName;
	private String phoneNumber;
	private Adresse adress;
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	
	private static int consultationPrice;
	
	// constructeur 
	public MedecinGeneraliste(String lastName, String firstName, String phoneNumber, Adresse adress, List<Creneau> creneaux) {
		setLastName(lastName);
		setFirstName(firstName);
		setPhoneNumber(phoneNumber);
		setAdress(adress);
		setCreneaux(creneaux);
	}
	
	public MedecinGeneraliste(String lastName, String firstName, String phoneNumber, Adresse adress) {
		setLastName(lastName);
		setFirstName(firstName);
		setPhoneNumber(phoneNumber);
		setAdress(adress);
	}
	
	public void ajouterCreneau(Creneau creneauAAjouter) {
		creneaux.add(creneauAAjouter);
		creneauAAjouter.setMedecin(this);
	}
	
	public void ajouterCreneaux(Creneau...creneaux) {
		for(Creneau current : creneaux) {
			ajouterCreneau(current);
		}
	}
	
	// getters & setters
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}

	public static int getConsultationPrice() {
		return consultationPrice;
	}

	public static void setConsultationPrice(int consultationPrice) {
		MedecinGeneraliste.consultationPrice = consultationPrice;
	}
	
	public Adresse getAdress() {
		return adress;
	}


	public void setAdress(Adresse adress) {
		this.adress = adress;
	}

	
	@Override
	public String toString() {
		return "MedecinGeneraliste [lastName=" 
						+ lastName 
						+ ", firstName=" 
						+ firstName 
						+ ", phoneNumber=" 
						+ phoneNumber
						+ ", adress=" 
						+ adress 
						+ ", creneaux=" 
						+ creneaux + "]";
	}
	
	
}
