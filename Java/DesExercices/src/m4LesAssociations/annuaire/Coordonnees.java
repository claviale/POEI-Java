package m4LesAssociations.annuaire;

public class Coordonnees {
	private String telFixe;
	private String telPort;
	private Contact contact;
	
	public Coordonnees(String telFixe, String telPort) {
		this.telFixe = telFixe;
		this.telPort = telPort;
	}

	public String getTelFixe() {
		return telFixe;
	}

	public void setTelFixe(String telFixe) {
		this.telFixe = telFixe;
	}

	public String getTelPort() {
		return telPort;
	}

	public void setTelPort(String telPort) {
		this.telPort = telPort;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Coordonnees [telFixe=" + telFixe + ", telPort=" + telPort + ", contact=" + contact.getNom() + "]";
	}
	
	
}
