package com.example.demoData.service;

import java.util.List;

import com.example.demoData.entity.Maison;

public interface MaisonService {
	public void create(Maison maison) throws MaisonServiceException;
	public List<Maison> getAll();

	
}
