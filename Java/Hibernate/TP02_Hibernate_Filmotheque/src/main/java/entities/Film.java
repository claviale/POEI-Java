package entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity @Table(name = "films")
public class Film {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titre;
	private int annee;
	private int duree;
	private boolean vu;
	private String synopsis;
	
	@ManyToOne
	@JoinColumn(name = "style_id")
	private Style style;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "realisateur_id")
	private Realisateur realisateur;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "film_id")
	private List<Acteur> acteurs;
	
	
	
	public Film(int id, String titre, int annee, int duree, boolean vu, String synopsis, Style style,
			Realisateur realisateur, List<Acteur> acteurs) {
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.vu = vu;
		this.synopsis = synopsis;
		this.style = style;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
	}
	
	public Film(String titre, int annee, int duree, boolean vu, String synopsis, Style style,
			Realisateur realisateur, List<Acteur> acteurs) {
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.vu = vu;
		this.synopsis = synopsis;
		this.style = style;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
	}

	public Film() {}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public boolean isVu() {
		return vu;
	}

	public void setVu(boolean vu) {
		this.vu = vu;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public Realisateur getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}

	public List<Acteur> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", duree=" + duree + ", vu=" + vu
				+ ", synopsis=" + synopsis + ", style=" + style + ", realisateur=" + realisateur + ", acteurs="
				+ acteurs + "]";
	}
	
	
}
