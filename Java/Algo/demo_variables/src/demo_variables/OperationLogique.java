package demo_variables;

public class OperationLogique {

	public static void main(String[] args) {
		
		System.out.println(5 > 3); //true
		System.out.println(5 < 3); //false
		
		System.out.println(4 < 4); //false
		System.out.println(4 <= 4); //true
		
		System.out.println(4 == 4); //true
		System.out.println(4 != 4); //false
		
		System.out.println(!true); //false
		System.out.println(!false); //true
		System.out.println(!(4 == 4)); //false (4 ==4 true donc inverse avec "!")
		
		System.out.println((6 % 2 == 0) && (8 + 1 == 9)); //true (les deux cotés sont bons, sinon false)
		System.out.println((5 - 3 < 0) || (5 + 3 > 0)); // true (un seul coté correct suffit pour true)
		System.out.println(!((5 - 3 < 0) || (5 + 3 > 0))); // false (on veut l'inverse de ce qu'il y a écrit)
		
		boolean a = true;
		boolean b = false;
		System.out.println((a || b) && !(a && b)); //XOR ou exclusif
		System.out.println(a ^ b); //XOR opérator ou exclusif
	
	}

}
