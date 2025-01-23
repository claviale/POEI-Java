package abstraction;

public abstract class Animal {
	protected String nom;

	public Animal(String nom) {
		this.nom = nom;
	}
	
	public abstract String crier();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Animal : \n\t" + nom;
	}
}
