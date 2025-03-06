package com.example.demoWS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Velo {
	
	@Id @GeneratedValue
	private Integer idVelo;
	private String marque;
	private Integer nbRoues;
	private String type;
	
}
