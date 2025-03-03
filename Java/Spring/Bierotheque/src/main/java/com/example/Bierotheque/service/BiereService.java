package com.example.Bierotheque.service;

import java.util.List;

import com.example.Bierotheque.entity.Biere;

public interface BiereService {
	public void create(Biere biere) throws BiereServiceException;
	public List<Biere> getAll();
	public void update(Biere biere) throws BiereServiceException;
	public void delete(Biere biere) throws BiereServiceException;

}
