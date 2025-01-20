package m5Heritage.magasin;

public class Ecran extends Article{
	private int taille;
	private String resolution;
	
	public Ecran(String nom, int quantite, float prix, int taille, String resolution) {
		super(nom, quantite, prix);
		this.taille = taille;
		this.resolution = resolution;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}


	@Override
	public String toString() {
		String result = "\n Ecran => ";
			result += super.toString();
			result += "taille : " ;
			result += taille ;
			result += ", résolution : ";
			result += resolution;
		return result;
	}
}
