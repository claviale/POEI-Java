package bo;

import java.time.LocalDate;

public class Patient {
	
	// attributs
	private String lastName;
	private String firstName;
	private String phoneNumber;
	private char gender;
	private long socialSecurityNumber;
	private LocalDate birthdayDate;
	private String comment;
	private Adresse adress;
	
	// constructeur 
	public Patient(String lastName, String firstName, String phoneNumber, char gender, long socialSecurityNumber, LocalDate birthdayDate, String comment, Adresse adress) {
		setLastName(lastName);
		setFirstName(firstName);
		setPhoneNumber(phoneNumber);
		setGender(gender);
		setSocialSecurityNumber(socialSecurityNumber);
		setBirthdayDate(birthdayDate);
		setComment(comment);
		setAdress(adress);
	}
	
	// constructeur avec le commentaire en facultatif ("" = vide)
	public Patient(String lastName, String firstName, String phoneNumber, char gender, long socialSecurityNumber, LocalDate birthdayDate, Adresse adress) {
		this(lastName, firstName, phoneNumber, gender, socialSecurityNumber, birthdayDate, "", adress);
	}
	
	// getters and setters
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(long socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public LocalDate getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(LocalDate birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Adresse getAdress() {
		return adress;
	}

	public void setAdress(Adresse adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		String result = "Patient [lastName=" 
				+ lastName 
				+ ", firstName=" 
				+ firstName 
				+ ", phoneNumber=" 
				+ phoneNumber
				+ ", gender=" 
				+ gender 
				+ ", socialSecurityNumber=" 
				+ socialSecurityNumber 
				+ ", birthdayDate="
				+ birthdayDate 
				+ ", comment=" ;
		if (comment == null || comment.isBlank()) {
			result += " RAS ";
		} else {
			result += comment;
		}
		result += ", adress=";
		result += adress ;
		result += "]";
		return result;
	}
	
	public String toStringAvecTernaire() {
		return "Patient [lastName=" 
				+ lastName 
				+ ", firstName=" 
				+ firstName 
				+ ", phoneNumber=" 
				+ phoneNumber
				+ ", gender=" 
				+ gender 
				+ ", socialSecurityNumber=" 
				+ socialSecurityNumber 
				+ ", birthdayDate="
				+ birthdayDate 
				+ ", comment=" 
				+ (comment.isBlank() ? " - " : comment)  // ternaire : si blanc (pas null!) j'affiche - sinon j'affiche le commentaire
				+ "]";
	}
}
