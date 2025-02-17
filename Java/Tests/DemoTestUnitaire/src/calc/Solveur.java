package calc;

public class Solveur {
	
	public void afficher50Premiers() {
		for (int i = 0; i <= 50; i++) {
			if (isPair(i)) {
				System.out.println(i + " est pair");
			} else {
				System.out.println(i + " est impair");
			}
			
			if (isDivByThree(i)) {
				System.out.println(i + " est divisible par 3");
			} else {
				System.out.println(i + " n'est pas divisible par 3");
			}
		}
	}
	
	public boolean isPair(int a) {
		return a % 2 == 0;
	}
	
	public boolean isDivByThree(int a) {
		return a % 3 == 0;
	}
}
