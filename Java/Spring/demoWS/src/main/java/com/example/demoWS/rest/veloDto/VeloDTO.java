package com.example.demoWS.rest.veloDto;

import com.example.demoWS.entity.Velo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeloDTO {
	private Integer id;
	private String mar;
	private String type;

	public VeloDTO(Velo velo) {
		this.id = velo.getIdVelo();
		this.mar = velo.getMarque();
		this.type = velo.getType();
	}

	public Velo toEntity() {
		return Velo.builder().idVelo(id).marque(mar).type(type).nbRoues(2).build();
	}
}