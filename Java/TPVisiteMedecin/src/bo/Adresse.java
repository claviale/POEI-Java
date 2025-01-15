package bo;

public class Adresse {
	private int number;
	private String additional;
	private String type;
	private String streetName;
	private String postalCode;
	private String city;
	private String information;
	
	
	public Adresse (int number, String additional, String type, String streetName, String postalCode, String city, String information) {
		setNumber(number);
		setAdditional(additional);
		setType(type);
		setStreetName(streetName);
		setPostalCode(postalCode);
		setCity(city.toUpperCase());
		setInformation(information);
	}
	
	//constructeur sans les mentions facultatives
	public Adresse (int number, String type, String streetName, String postalCode, String city) {
		setNumber(number);
		setType(type);
		setStreetName(streetName);
		setPostalCode(postalCode);
		setCity(city.toUpperCase());
	}

	public void display() {
		System.out.println(toString());
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	@Override
	public String toString() {
		return "Adresse [number=" + number + ", additional=" + additional + ", type=" + type + ", streetName="
				+ streetName + ", postalCode=" + postalCode + ", city=" + city + ", information=" + information + "]";
	}
	
	
}
