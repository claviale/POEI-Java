package com.example.demoWS.service;

import java.util.List;

import com.example.demoWS.entity.Velo;

public interface VeloService {
	public void create(Velo velo);
	public void update(Velo velo);
	public void delete(Velo velo);
	public List<Velo> getAll();
	public Velo getById(Integer id) throws VeloServiceException;
	
}
