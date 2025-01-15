package bo;

public class MedecinGeneraliste {
	
	// attributs
	private String lastName;
	private String firstName;
	private String phoneNumber;
	
	private static int consultationPrice;
	
	// constructeur 
	public MedecinGeneraliste(String lastName, String firstName, String phoneNumber) {
		setLastName(lastName);
		setFirstName(firstName);
		setPhoneNumber(phoneNumber);
	}
	
	
	public void display() {
		System.out.println(toString());
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

	public static int getConsultationPrice() {
		return consultationPrice;
	}

	public static void setConsultationPrice(int consultationPrice) {
		MedecinGeneraliste.consultationPrice = consultationPrice;
	}
	
	// generate toString
	@Override
	public String toString() {
		return "MedecinGeneraliste [lastName=" 
						+ lastName 
						+ ", firstName=" 
						+ firstName 
						+ ", phoneNumber=" 
						+ phoneNumber 
						+ ", tarif="
						+ consultationPrice
						+ "]";
	}
	
}
