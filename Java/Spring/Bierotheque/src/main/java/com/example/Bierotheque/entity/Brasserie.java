package com.example.Bierotheque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Brasserie {
	@Id @GeneratedValue
	private Integer idBrasserie;
	private String nom;
	private String ville;
	
	public Brasserie(String nom, String ville) {
		this.nom = nom;
		this.ville = ville;
	}
	

	
}
