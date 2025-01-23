package controller;

import java.io.FileWriter;
import java.io.IOException;

public class DemoEcritureFichier {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("demo_ecriture.txt", true);
			writer.write("coucou ");
			writer.close();
			System.out.println("Création du fichier réussie");
		} catch (IOException e) {
			System.err.println("Oups, on dirait que quelque chose à planté !");
			e.printStackTrace();
		}
		
	}
}
