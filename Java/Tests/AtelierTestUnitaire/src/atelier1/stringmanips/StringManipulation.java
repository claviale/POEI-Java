package atelier1.stringmanips;

import java.security.InvalidParameterException;

public class StringManipulation {

	public String concatenation(String a, String b) {
		return a.concat(b);
	}
	
	public String zip(String a, String b) {
		if (a.length() != b.length()) {
			throw new InvalidParameterException("Les deux chaines de caracteres ne font pas la meme taille !");
		}
		String resultat = "";
		for (int i = 0; i < a.length(); i++) {
			resultat += b.charAt(i) + a.charAt(i);
		}
		return resultat;
	}
	
	public String reverse(String a) {
		if (a == null) {
			throw new InvalidParameterException("La chaine ne peut pas etre null");
		}
		String resultat = "";
		for (char c : a.toCharArray()) {
			resultat = c + resultat;
		}
		return resultat;
	}
	
	public String caps(String a) {
		String resultat = "";
		for (char c : a.toCharArray()) {
			resultat += (char)(c - 32);
		}
		return resultat;
	}
	
	public String substring(String a, int borneInf, int borneSup) {
		if (borneInf < 0) {
			throw new InvalidParameterException("La borne inferieure ne peut pas etre negative");
		}
		if (borneSup >= a.length()) {
			throw new InvalidParameterException("La borne superieure ne peut pas etre plus grande que la chaine");
		}
		String resultat = "";
		for (int i = borneInf; i < borneSup; i++) {
			resultat += a.charAt(i);
		}
		return resultat;
	}
} 
