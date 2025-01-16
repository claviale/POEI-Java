package bo;

public class Personne {
	protected String lastName;
	protected String firstName;
	protected String phoneNumber;
	protected Adresse adress;
	
	public Personne(String lastName, String firstName, String phoneNumber, Adresse adress) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
	}

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

	public Adresse getAdress() {
		return adress;
	}

	public void setAdress(Adresse adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Personne [lastName=" 
						+ lastName 
						+ ", firstName=" 
						+ firstName 
						+ ", phoneNumber=" 
						+ phoneNumber
						+ ", adress=" 
						+ adress 
						+ "]";
	}
	
	
	
	
	
}
