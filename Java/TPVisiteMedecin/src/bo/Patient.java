package bo;

import java.time.LocalDate;

public class Patient extends Personne {
	
	// attributs
	private char gender;
	private long socialSecurityNumber;
	private LocalDate birthdayDate;
	private String comment;
	
	
	public Patient(String lastName, String firstName, String phoneNumber, Adresse adress, char gender,
			long socialSecurityNumber, LocalDate birthdayDate, String comment) {
		super(lastName, firstName, phoneNumber, adress);
		this.gender = gender;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthdayDate = birthdayDate;
		this.comment = comment;
	}

	// constructeur avec le commentaire en facultatif ("" = vide)
	public Patient(String lastName, String firstName, String phoneNumber, Adresse adress, char gender,
			long socialSecurityNumber, LocalDate birthdayDate) {
		this(lastName, firstName, phoneNumber, adress, gender, socialSecurityNumber, birthdayDate, "");
	}
	
	// getters and setters
	
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

	@Override
	public String toString() {
		String result = super.toString(); 
		result += ", gender=";
		result +=  gender;
		result += ", socialSecurityNumber="; 
		result += socialSecurityNumber;
		result +=  ", birthdayDate=";
		result +=  birthdayDate;
		result +=  ", comment=" ;
		if (comment == null || comment.isBlank()) {
			result += " RAS ";
		} else {
			result += comment;
		}
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
