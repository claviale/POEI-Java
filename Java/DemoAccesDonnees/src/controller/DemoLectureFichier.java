package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoLectureFichier {
	public static void main(String[] args) {
		File fichier = new File("demo.csv");
		Scanner scan;
		try {
			scan = new Scanner(fichier);
			while (scan.hasNext()) {
				String line = scan.nextLine();
				String parts[] = line.split(",");
				System.out.println("Votre nom est : " + parts[0]);
				System.out.println("Votre prénom est : " + parts[1]);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
