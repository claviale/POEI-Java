package m5Heritage.magasin;

public class Clavier extends Article {
	public enum Disposition {
		AZERTY, QWERTY
	}
	
	private Disposition disposition;

	public Clavier(String nom, int quantite, float prix, Disposition disposition) {
		super(nom, quantite, prix);
		this.disposition = disposition;
	}

	public Disposition getDisposition() {
		return disposition;
	}

	public void setDisposition(Disposition disposition) {
		this.disposition = disposition;
	}

	@Override
	public String toString() {
		String result = "\n Clavier => ";
			result += super.toString();
			result += ", disposition : " ;
			result += disposition;
		return result;
	}
	
	
}
