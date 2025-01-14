package demo_locale;

public class DemoString {
	public static void main(String[] args) {
		// On ne peut pas altérer String, il faut l'assigner à une  variable, 
		// pour créer une copie et pouvoir altérer celle ci
		String phrase = "hello world";
		
		String phraseTransformee = 
				phrase
				.toUpperCase()
				.concat(" !")
				.indent(4)
				.replace("O", "X");
		System.out.println(phrase); // Affiche hello world
		System.out.println(phraseTransformee); // Affiche     HELLX WXRLD !
	}
}
