package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bo.Heros;
import exceptions.BadCSVFormattingException;

public class ReadHeros {
	public static void main(String[] args) {
		List<Heros> heroes = new ArrayList<Heros>();
		File fichier = new File("broken-data.csv");
		try {
			readHeroes(heroes, fichier);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < heroes.size(); i++) {
			System.out.format("%s\n", heroes.get(i));
		}
	}

	private static void readHeroes(List<Heros> heroes, File fichier) throws FileNotFoundException {
		Scanner scan = new Scanner(fichier);
		int numeroLigne = 1;
		
		// Passer l'entête du fichier
		if (scan.hasNext()) {
			scan.nextLine();
			numeroLigne++;
		}
		
		while (scan.hasNext()) {
			String line = scan.nextLine();
			try {
				Heros heros = convertLineToHero(line);
				heroes.add(heros);
			} catch (DateTimeParseException dtpe) {
				System.err.format("Impossible d'extraire la date de la ligne : %2d. %s\n", numeroLigne, line);
			}catch (BadCSVFormattingException bcfe) {
				System.err.format("Les informations fournies ne correspondent pas à l'attendu : %2d. %s\n", numeroLigne, line);
			}
			numeroLigne++;
		}
		scan.close();
	}

	private static Heros convertLineToHero(String line) 
			throws DateTimeParseException, BadCSVFormattingException {
		String[] parts = line.split(",");
		if (parts.length != 3) {
			throw new BadCSVFormattingException();
		}
		
		String nom = parts[0];
		String prenom = parts[1];
		String dateNaissance = parts[2].trim();
		
		// Formatter la date 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("[d/M/y][y-M-d]");
		LocalDate dateHeros = LocalDate.parse(dateNaissance, dtf);
		
		return new Heros(nom, prenom, dateHeros);
	}
}
