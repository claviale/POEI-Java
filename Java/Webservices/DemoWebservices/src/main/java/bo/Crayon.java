package bo;

public class Crayon {
	private int id;
	private String type;
	private String couleur;
	
	public Crayon(int id, String type, String couleur) {
		this.id = id;
		this.type = type;
		this.couleur = couleur;
	}

	public Crayon(String type, String couleur) {
		this.type = type;
		this.couleur = couleur;
	}
	
	public Crayon() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
