package association_unidirectionnelle;

public class TestAssociation {
	public static void main(String[] args) {
		Animal milou = new Animal ("Milou", "Waf waf");
		Animal garfield = new Animal("Garfield", "Lasagnes !");
		
		Personne tintin = new Personne("Tintin", milou);
		Personne john = new Personne("John", garfield);
		
		System.out.println(tintin.getAnimal().getNom()); // Affiche Milou
		System.out.println(john.getAnimal().getCri()); // Affiche Lasagnes !
		
		tintin.appeler(); // Affiche Au pied, Milou
		
	}
}
