package com.example.Bierotheque.service;

import java.util.List;

import com.example.Bierotheque.entity.Brasserie;

public interface BrasserieService {
	public void create(Brasserie brasserie) throws BrasserieServiceException;
	public List<Brasserie> getAll();
}
