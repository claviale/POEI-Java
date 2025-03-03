package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CalculatriceImpl implements Calculatrice {

	@Override
	public Integer plus(Integer a, Integer b) {
		return a + b;
	}

}
