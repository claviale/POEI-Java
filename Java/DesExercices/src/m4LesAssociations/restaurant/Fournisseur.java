package m4LesAssociations.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur {
	private String nom;
	private List<Restaurant> restaurants = new ArrayList<Restaurant>();
	
	public Fournisseur(String nom) {
		this.nom = nom;
	}
	
	public void ajouterRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	@Override
	public String toString() {
		return nom;
	}
	
}
