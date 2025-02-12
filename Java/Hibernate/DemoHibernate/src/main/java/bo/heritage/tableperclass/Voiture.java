package bo.heritage.tableperclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name = "voitureTPC") @Table(name = "voituresTPC")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Voiture {
	
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private String marque;
	
	public Voiture() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
}
