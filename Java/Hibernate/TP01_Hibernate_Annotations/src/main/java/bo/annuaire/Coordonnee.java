package bo.annuaire;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "coordonnees")
public class Coordonnee {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String telFixe;
	private String telPortable;
	
	public Coordonnee() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelFixe() {
		return telFixe;
	}

	public void setTelFixe(String telFixe) {
		this.telFixe = telFixe;
	}

	public String getTelPortable() {
		return telPortable;
	}

	public void setTelPortable(String telPortable) {
		this.telPortable = telPortable;
	}
	
	
	
}
