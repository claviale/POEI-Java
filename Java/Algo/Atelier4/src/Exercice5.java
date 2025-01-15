import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre");
		int nombre = scan.nextInt();

		scan.close();
		
		for (int i = 1; i <= nombre; i++) {
			System.out.println(i*i);
			
		}
	}
}
