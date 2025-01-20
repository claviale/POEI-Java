package genericite;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		//long start = System.currentTimeMillis();
		List<Personne> lesMorts = new ArrayList<>();
		
		lesMorts.add(new Personne("Berger", "Michel"));
		lesMorts.add(new Personne("Kamakawiwo'ole", "Israel"));
		Personne michelBlanc = new Personne("Blanc", "Michel");
		lesMorts.add(michelBlanc);
		
		//Test temps execution avec start et end
		//for (int i = 0; i < 10000; i++) {
		//	lesMorts.add(new Personne("Nom" + i, "Prenom" + i));
		//}
		
		System.out.println(lesMorts);
		
		//remove Michel Berger de la liste = index position
		lesMorts.remove(0);
		//remove Michel blanc de la liste = nom instance
		lesMorts.remove(michelBlanc);
		
		System.out.println(lesMorts);
		
		System.out.println(lesMorts.get(0));
		
		//Remplace la personne en position 0 
		lesMorts.set(0, new Personne("Sardou", "Michel"));
		System.out.println(lesMorts);
		
		System.out.println(lesMorts.get(0).hashCode()); 
		// affiche 1543260419
		//Hash plus facile à comparer que le equals (juste un int à comparer)
		
		//long end = System.currentTimeMillis();
		
		//Affiche le temps d'execution du programme
		//System.out.println("Le programme s'est exécuté en " + (end - start) + " millisecondes");
		
		
		
	}
}
