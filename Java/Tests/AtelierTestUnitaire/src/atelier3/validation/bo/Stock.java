package atelier3.validation.bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Stock {
	private static Map<String, Integer> stock = new HashMap<>();
	
	public static List<String> getDisplayStock() {
		List<String> result = new ArrayList<>();
		for (String key : stock.keySet()) {
			result.add(key + " (" + stock.get(key) + ")");
		}
		return result;
	}
	
	public static boolean modifierArticle(String article, int qtt) {
		if (!stock.containsKey(article)) {
			return false;
		}
		int newQtt = stock.get(article) + qtt;
		if (newQtt < 0) {
			return false;
		}
		stock.replace(article, newQtt);
		return true;
	}
	
	public static boolean ajouterArticle(String article, int qtt) {
		if (stock.containsKey(article)) {
			return false;
		}
		if (qtt < 1) {
			return false;
		}
		stock.put(article, qtt);
		return true;
	}
}
