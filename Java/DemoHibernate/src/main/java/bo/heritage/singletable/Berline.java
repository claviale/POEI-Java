package bo.heritage.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "berlineST")
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
