package com.example.Bierotheque.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Brasserie brasserie;
	
	private String type;
	private Integer note;
	private String commentaire;
	private Float tauxAlcool;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Caracteristique> listeCar = new ArrayList<>();
	
	public Biere(String nom, Brasserie brasserie, String type, Integer note, String commentaire, Float tauxAlcool) {
		this.nom = nom;
		this.brasserie = brasserie;
		this.type = type;
		this.note = note;
		this.commentaire = commentaire;
		this.tauxAlcool = tauxAlcool;
	}
	
	public void addCar(Caracteristique car) {
		listeCar.add(car);
	}
	
	
	
}
