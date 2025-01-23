package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bo.Heros;

public class ReadHeros {
	public static void main(String[] args) {
		List<Heros> heros = new ArrayList<Heros>();
		File fichier = new File("broken-data.csv");
		Scanner scan;
		try {
			scan = new Scanner(fichier);
			while (scan.hasNext()) {
				String line = scan.nextLine();
				String parts[] = line.split(",");
				Heros hero = new Heros(parts[0], parts[1], parts[2]);
				heros.add(hero);
				System.out.println(hero.getNom() + ", " + hero.getPrenom() + ", " + hero.getDateNaissance());
				
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
