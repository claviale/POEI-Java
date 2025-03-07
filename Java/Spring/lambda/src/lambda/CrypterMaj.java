package lambda;

public class CrypterMaj implements Crypter {

	@Override
	public String crypter(String message) {
		return message.toUpperCase();
	}

}
