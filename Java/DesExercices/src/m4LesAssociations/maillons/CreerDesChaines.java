package m4LesAssociations.maillons;

import java.util.Scanner;

public class CreerDesChaines {
	public static void main(String[] args) {
		/*
		 * Créez une classe Question. La classe Question se caractérise par les attributs : 
		 *  - un énoncé (String) --> la question se répond par "vrai" ou "faux"
		 *  - la réponse (boolean)
		 *  - la Question suivante (Question) --> il s'agit d'une association de Question vers Question (!)
		 *  
		 * La classe Question a deux constructeurs possibles : 
		 *  - un qui prend l'énoncé et la réponse
		 *  - un qui prend tous les attributs
		 *  
		 * La classe Question propose les méthodes suivantes : 
		 *  - les getters et setters
		 *  
		 * Créez enfin plusieurs questions (au moins 3) que vous lierez les unes aux autres
		 *  "Question A -> Question B -> Question C -> null"
		 *  
		 * L'objectif final est de poser les questions au joueur dans l'ordre, et de lui indiquer si sa réponse
		 * est bonne ou pas
		 * 
		 * Il s'agit d'un exercice diffile, mais intéressant pour continuer d'appréhender les associations !
		 */
		Question question3 = new Question("Ori est un chien, vrai ou faux?", false);
		Question question2 = new Question("Etienne est-il mauvais?", true, question3);
		Question question1 = new Question("Le Grinch est-il vert?", true, question2);
		
		Question currentQuestion = question1;
		Scanner scan = new Scanner(System.in);
		int bonnesReponse = 0;
		int nbQuestions = 0;
		while (currentQuestion != null) {
			System.out.println(currentQuestion.getEnonce());
			boolean reponse = scan.nextBoolean();
			scan.nextLine();
			if (reponse == currentQuestion.isReponse()) {
				System.out.println("Bonne réponse !");
				bonnesReponse++;
			} else {
				System.out.println("Mauvaise réponse ! (gros naze)");
			}
			System.out.println();
			nbQuestions++;
			currentQuestion = currentQuestion.getQuestionSuivante();
		}
		System.out.println("Fin du quizz");
		System.out.format("Nombre de bonnes réponses : %d/%d", bonnesReponse, nbQuestions);
		scan.close();
		
	}
}
