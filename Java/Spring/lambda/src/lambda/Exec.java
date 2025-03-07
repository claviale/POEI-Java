package lambda;

import java.util.function.Predicate;

public class Exec {

	public static void main(String[] args) {
		Crypter maj = new CrypterMaj();
		System.out.println(maj.crypter(("Coucou")));
		
		
		Crypter min = new Crypter() {
			
			@Override
			public String crypter(String message) {
				return message.toLowerCase();
			}
		};
		System.out.println(min.crypter("Coucou"));
		
		Crypter min2 = m -> m.toLowerCase();
		System.out.println(min2.crypter("Coucou"));
		
		
		
		
	}

}
