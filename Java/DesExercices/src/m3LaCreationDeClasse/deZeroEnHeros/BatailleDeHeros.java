package m3LaCreationDeClasse.deZeroEnHeros;

public class BatailleDeHeros {
	public static void main(String[] args) {
		/*
		 * Créez la classe Heros.
		 * Un Heros est défini par les attributs suivants : 
		 *  - un nom (String)
		 *  - un montant de point de vie (int)
		 *  - un montant d'attaque (int)
		 *  
		 * Un Heros dispose des methodes suivantes :
		 *  - estVivant() : boolean --> retourne true si les points de vie du joueur sont supérieurs à 0
		 *  - attaquer(Heros autreHeros) : void --> inflige des degats a l'autre heros et l'affiche dans la console
		 *  
		 * Pour finir, instanciez deux Heros, et attrapez vos popcorn en les regardant s'affronter.
		 * Exemple d'affichage final :
		 * __________________________________________________
		 * Hercule (PV : 100 - Atk : 10)
		 * Quasimodo (PV : 20 - Atk : 2)
		 * *****************************
		 * Quasimodo attaque Hercule !
		 * Hercule (PV : 98 - Atk : 10)
		 * Quasimodo (PV : 20 - Atk : 2)
		 * *****************************
		 * Hercule attaque Quasimodo !
		 * Hercule (PV : 98 - Atk : 10)
		 * Quasimodo (PV : 10 - Atk : 2)
		 * *****************************
		 * Quasimodo attaque Hercule !
		 * Hercule (PV : 96 - Atk : 10)
		 * Quasimodo (PV : 20 - Atk : 2)
		 * *****************************
		 * Hercule attaque Quasimodo !
		 * Hercule (PV : 96 - Atk : 10)
		 * Quasimodo (PV : 0 - Atk : 2)
		 * *****************************
		 * Fin de l'affrontement ! Hercule est le vainqueur !
		 * 
		 * Pour aller plus loin (et vous amuser un peu) :
		 * Ajoutez les attributs suivants au Heros, et tenez-en compte dans la méthode attaquer :
		 *  - esquive (int) --> au moment de l'attaque, si le nombre aleatoire tiré est inférieur a l'esquive, le coup est évité
		 *  - defense (int) --> au moment de l'attaque, les degats sont reduits du montant de l'armure
		 *  - critique (int) --> au moment de l'attaque, si le nombre aleatoire tiré est inférieur au critique, les degats sont doublés
		 * __________________________________________________
		 */
		Heros hercule = new Heros("Hercule", 100, 10);
		Heros quasimodo = new Heros("Quasimodo", 20, 2);
		
		System.out.println("Fight !");
		System.out.println(hercule.toString());
		System.out.println(quasimodo.toString());
		System.out.println("*****************************");
		while (hercule.estVivant() && quasimodo.estVivant()) {
			quasimodo.attaquer(hercule);
			System.out.println("*****************************");
			hercule.attaquer(quasimodo);
			System.out.println("*****************************");
		}
		System.out.print("Fin de l'affrontement ! ");
		Heros vainqueur = hercule.estVivant() ? hercule : quasimodo;
		System.out.println(vainqueur.getNom() + " est le vainqueur !");
	}
}
