package com.example.demoData.service;

import java.util.List;

import com.example.demoData.entity.Personne;

public interface PersonneService {
	public void create(Personne personne) throws PersonneServiceException;
	public List<Personne> getAll();
	public List<Personne> getAllAge(Integer age);
}
