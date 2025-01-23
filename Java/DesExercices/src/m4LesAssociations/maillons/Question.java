package m4LesAssociations.maillons;

public class Question {
	private String enonce;
	private boolean reponse;
	private Question questionSuivante;
	
	public Question(String enonce, boolean reponse, Question questionSuivante) {
		this.enonce = enonce;
		this.reponse = reponse;
		this.questionSuivante = questionSuivante;
	}
	
	public Question(String enonce, boolean reponse) {
		this.enonce = enonce;
		this.reponse = reponse;
	}

	public String getEnonce() {
		return enonce;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	public boolean isReponse() {
		return reponse;
	}

	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}

	public Question getQuestionSuivante() {
		return questionSuivante;
	}

	public void setQuestionSuivante(Question questionSuivante) {
		this.questionSuivante = questionSuivante;
	}
	
}
