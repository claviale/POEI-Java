package association_unidirectionnelle;

public class Personne {
	private String nom;
	private Animal animal;
	
	public Personne(String nom, Animal animal) {
		this.nom = nom;
		this.animal = animal;
	}
	
	public void appeler() {
		System.out.println("Au pied, " + animal.getNom());
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	
}
