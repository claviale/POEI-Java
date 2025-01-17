package abstraction;

public class Renard extends Animal  {
	private String couleur;
	
	public Renard(String nom, String couleur) {
		super(nom);
		this.couleur = couleur;
	}
	
	@Override
	public String crier() {
		return "Kyouuu";
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "\n\t";
		result += "Couleur : " + couleur;
		
		return result;
	}
}
