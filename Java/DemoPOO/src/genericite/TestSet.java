package genericite;


import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		
		Set<Personne> lesMorts = new HashSet<>();
		
		//le set n'accepte pas l'ajout de doublon, et n'est pas ordonné, contrairement à la liste
		lesMorts.add(new Personne("Berger", "Michel"));
		lesMorts.add(new Personne("Kamakawiwo'ole", "Israel"));
		lesMorts.add(new Personne("Blanc", "Michel"));
		
		System.out.println(lesMorts);
		
		//remove Michel blanc de la liste grâce au hash et equals dans Personne 
		//(pas besoin de variable  pour  isntancier puis suppr)
		
		lesMorts.remove(new Personne("Blanc", "Michel"));
		
		System.out.println(lesMorts);

	
		
	}
}
