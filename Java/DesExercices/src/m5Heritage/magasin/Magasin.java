package m5Heritage.magasin;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
	private String nom;
	private List<Article> articles = new ArrayList<Article>();
	
	public Magasin(String nom) {
		this.nom = nom;
	}
	
	public void ajouterArticle(Article article) {
		articles.add(article);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return " Magasin " + nom + ", \n Articles disponibles :" + articles;
	}
	
	
	
}
