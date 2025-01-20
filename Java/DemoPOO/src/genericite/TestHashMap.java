package genericite;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String, Personne> contacts = new HashMap<>();
		
		contacts.put("Berger", new Personne("Berger", "Michel"));
		contacts.put("Cassin", new Personne("Cassin", "Etienne"));
		contacts.put("Kamakawiwo'ole", new Personne("Kamakawiwo'ole", "Israel"));
		contacts.put("Blanc", new Personne("Blanc", "Michel"));
		
		System.out.println(contacts.get("Berger"));
		
		contacts.remove("Berger");
		
		//Berger est remove juste avant, affiche null
		System.out.println(contacts.get("Berger"));
		
		//Attention, écrase Etienne Cassin car même key
		contacts.put("Cassin", new Personne("Cassin", "Antoine"));
		System.out.println(contacts.get("Cassin"));
		
		//Map de liste
		//Map<String, List<Personne>> contactsAlpahabetique = new HashMap<>();
	}
}
