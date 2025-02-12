package bo.heritage.joined;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "berlineJ") @Table(name = "berlinesJ")
@DiscriminatorValue("berline")

public class Berline extends Voiture {
	
	@Column(name = "couleur_cuir")
	private String couleurCuir;

	public Berline() {}

	public String getCouleurCuir() {
		return couleurCuir;
	}

	public void setCouleurCuir(String couleurCuir) {
		this.couleurCuir = couleurCuir;
	}
	
	
}
