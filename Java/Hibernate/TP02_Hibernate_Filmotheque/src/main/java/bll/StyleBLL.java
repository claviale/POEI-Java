package bll;

import java.util.List;

import dal.StyleDAO;
import entities.Style;


public class StyleBLL {
	private StyleDAO dao;
	
	public StyleBLL() {
		dao = new StyleDAO();
	}
	
	public List<Style> select() {
		return dao.select();
	}
	
	public Style selectById(int id) {
		return dao.selectById(id);
	}
	
	public void insert(Style style) {
		if (style.getLibelle() == null || style.getLibelle().trim().isEmpty()) {
			throw new IllegalArgumentException("Le libellé ne peut pas être vide");
		}
		
		dao.insert(style);
	}
	
	public void update(Style style) {
		dao.update(style);
	}
	
	public void delete(Style style) {
		//if (style == null || style.getId() <= 0) {
		//	throw new IllegalArgumentException("Le style n'existe pas");
		//}
		Style existingStyle = dao.selectById(style.getId());
		if (existingStyle == null) {
			 throw new IllegalArgumentException("Style non trouvé");
		}
		
		dao.delete(existingStyle);
	}
}
