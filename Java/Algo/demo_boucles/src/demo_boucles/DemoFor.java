package demo_boucles;

public class DemoFor {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			//Affiche 1 2 3 4 5 6 7 8 9 10
		}
		
		//Changer le pas i+= 2
		for (int i = 0; i <= 50; i+= 2) {
			System.out.println(i);
		}
		
		//Decrease
		for (int i = 20; i >= -10; i--) {
			System.out.println(i);
		}
	}
}
