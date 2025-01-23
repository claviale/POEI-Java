package interfaces;

import java.util.ArrayList;
import java.util.List;

public class TestDessiner {
	public static void main(String[] args) {
		Chat chat = new Chat("Felix");
		Chien chien = new Chien("Medor");
		Bonhomme bonhomme = new Bonhomme();
		
		List<IDessinable> dessins = new ArrayList<IDessinable>();
		dessins.add(chien);
		dessins.add(chat);
		dessins.add(bonhomme);
		
		for (IDessinable current : dessins) {
			current.dessiner();
		}
	}
}
