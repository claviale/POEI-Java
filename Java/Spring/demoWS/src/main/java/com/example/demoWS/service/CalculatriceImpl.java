package com.example.demoWS.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatriceImpl implements Calculatrice {

	@Override
	public Integer calcul(Integer a, Integer b, String op) {
		return switch (op) {
		case "plus" -> a+b;
		case "moins" -> a-b;
		case "fois" -> a*b;
		case "div" -> a/b;
		default -> throw new IllegalArgumentException("Unexpected value: " + op);
		};
	}

}
