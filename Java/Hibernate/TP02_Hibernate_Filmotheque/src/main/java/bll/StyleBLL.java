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
		dao.insert(style);
	}
	
	public void update(Style style) {
		dao.update(style);
	}
	
	public void delete(Style style) {
		dao.delete(style);
	}
}
