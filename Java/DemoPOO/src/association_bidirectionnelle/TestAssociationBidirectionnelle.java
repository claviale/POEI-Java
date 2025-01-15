package association_bidirectionnelle;

public class TestAssociationBidirectionnelle {
	public static void main(String[] args) {
		
		Eleve neo = new Eleve("Neo");
		Eleve trinity = new Eleve("Trinity");
		Eleve morpheus = new Eleve("Morpheus");
		Eleve loracle = new Eleve("Loracle");
		Eleve smith = new Eleve("Smith");
		
		Groupe matrix = new Groupe("Matrix");
		
		matrix.ajouterEleve(neo);
		//neo.setGroupe(matrix);
		matrix.ajouterEleve(trinity);
		matrix.ajouterEleve(morpheus);
		matrix.ajouterEleve(loracle);
		matrix.ajouterEleve(smith);
		
		//Ajouter tous les élèves au groupe
		//matrix.ajouterEleves(neo, trinity, morpheus, loracle, smith, new Eleve("Valentin"));
		//matrix.ajouterEleves(new Eleve("Clara")); // Créer un deuxieme tableau de 1
		System.out.println(matrix);
	}
}
