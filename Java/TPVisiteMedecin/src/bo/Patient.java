package bo;

import java.time.LocalDate;

public class Patient {
	
	// attributs
	private String lastName;
	private String firstName;
	private String phoneNumber;
	private char gender;
	private int socialSecurityNumber;
	private LocalDate birthdayDate;
	private String comment;
	
	// constructeur 
	public Patient(String lastName, String firstName, String phoneNumber, char gender, int socialSecurityNumber, LocalDate birthdayDate, String comment) {
		setLastName(lastName);
		setFirstName(firstName);
		setPhoneNumber(phoneNumber);
		setGender(gender);
		setSocialSecurityNumber(socialSecurityNumber);
		setBirthdayDate(birthdayDate);
		setComment(comment);
	}
	
	// méthodes
	public void display()
	{
		System.out.println(firstName + " " + lastName + " (" + gender + "), n° de sécurité sociale : " + socialSecurityNumber + ", né(e) le "+ birthdayDate + ", n° de téléphone : " + phoneNumber + ", commentaire : " + comment);
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
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) {
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
	
	
		
}
