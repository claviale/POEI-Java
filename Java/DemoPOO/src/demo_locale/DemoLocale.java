package demo_locale;

import java.util.Locale;

public class DemoLocale {
	public static void main(String[] args) {
		
		// Ctrl + Shift + O => imports automatiques
		
		// On instancie la classe Locale dans une variable "localeFR"
		// localeFR est une instance de la classe Locale
		// Pour ça, on a utilisé le constructeur avec le mot clé "new"
		
		Locale localeFR = new Locale("FR", "fr");
		
		// 3 surcharges du constructeur de Locale
		Locale localeEN = new Locale("EN", "gb");
		Locale localeDE = new Locale("DE");
		Locale localeMarseille = new Locale("FR", "fr", "ma");
		
		System.out.println(localeFR.getCountry()); // Affiche FR
		System.out.println(localeEN.getCountry()); // Affiche GB
		
		System.out.println(localeFR.getDisplayName()); // Affiche français (France)
		System.out.println(localeEN.getDisplayName()); // Affiche anglais (Royaume-Uni)
		
		// Surcharge de la méthode (d'instance) getDisplayLanguage (une sans param, une avec)
		System.out.println(localeFR.getDisplayLanguage()); // Affiche français
		System.out.println(localeEN.getDisplayLanguage()); // Affiche anglais (pc en français)
		System.out.println(localeEN.getDisplayLanguage(localeEN)); // Affiche English
		
		System.out.println("****************");
		
		// Utilisation de la méthode de classe getAvailableLocales()
		Locale[] mesLocales = Locale.getAvailableLocales();
		for (Locale current : mesLocales) {
			System.out.println(current);
		}
		System.out.println(mesLocales.length);
	}
}
