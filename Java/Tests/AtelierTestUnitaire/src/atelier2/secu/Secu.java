package atelier2.secu;

import java.security.InvalidParameterException;

public class Secu {
	public String calculCode(Individu ind) {
		String code = "";
		code += codeCivilite(ind.getCivilite()) + " ";
		code += codeAnnee(ind.getDateNaissance().getYear()) + " ";
		code += codeMois(ind.getDateNaissance().getMonthValue());
		return code;
	}
	
	public String codeCivilite(String civilite) {
		if (civilite.equalsIgnoreCase("homme")) {
			return "1";
		}
		if (civilite.equalsIgnoreCase("femme")) {
			return "2";
		}
		throw new InvalidParameterException("L'individu n'est ni homme ni femme");
	}
	
	public String codeAnnee(int annee) {
		return String.valueOf(annee % 100);
	}
	
	public String codeMois(int mois) {
		if (mois < 1 || mois > 12) {
			throw new InvalidParameterException("Le mois doit etre compris entre 1 et 12");
		}
		return String.valueOf(mois);
	}
}
