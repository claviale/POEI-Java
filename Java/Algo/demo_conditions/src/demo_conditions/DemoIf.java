package demo_conditions;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir une note");
		int note = scan.nextInt();
		scan.close();
		
		if (note >= 15) {
			System.out.println("Félicitations, vous avez triché !");
		} else if (note>= 10 ) {
			System.out.println("Trop mauvais pour tricher mais pas mal quand même.");
		} else {
			System.out.println("Non seulement tu triches pas mais en plus t'es pas bon.");
		}

	}
}
