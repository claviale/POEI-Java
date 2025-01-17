package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bo.Cycle;
import bo.Gyropode;
import bo.Gyroroue;
import bo.Velo;

public class Magasin {
	public static void main(String[] args) {
		List<Cycle> location = new ArrayList<Cycle>();
		location.add(new Velo("Lapierre", "Speed Run 400", LocalDate.of(2021, 3, 25), 27));
		location.add(new Velo("Btwin", "Riverside 900", LocalDate.of(2022, 4, 10), 10));
		location.add(new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2022, 3, 12), 40, "1m50"));
		location.add(new Gyropode("Weebot", "echo", LocalDate.of(2022, 3, 12), 35, "1m60"));
		location.add(new Gyroroue("Immotion", "v8", LocalDate.of(2022, 3, 12), 40));
		location.add(new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2020, 12, 4), 30));
		
		
		
		System.out.println("Liste des cycles disponibles à la location : \n");
		
		for (Cycle current : location) {
			System.out.println(current);
		}
	}
}
