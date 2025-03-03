package com.example.demoData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Personne {
	@Id @GeneratedValue
	private Integer id;
	private String nom;
	private String prenom;
	private Integer age;
	
	@ManyToOne()
	private Maison maison;
	
	public Personne(String nom, String prenom, Integer age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
}
