package com.example.Bierotheque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Biere {
	@Id @GeneratedValue
	private Integer idBiere;
	private String nom;
	
	@ManyToOne
	private Brasserie brasserie;
	
	private String type;
	private Integer note;
	private String commentaire;
	private Float tauxAlcool;
	
	public Biere(String nom, String type, Integer note, String commentaire, Float tauxAlcool) {
		this.nom = nom;
		this.type = type;
		this.note = note;
		this.commentaire = commentaire;
		this.tauxAlcool = tauxAlcool;
	}
	
	
	
	
}
