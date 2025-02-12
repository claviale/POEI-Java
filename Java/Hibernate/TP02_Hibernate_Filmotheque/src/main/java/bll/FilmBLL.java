package bll;

import java.util.List;

import dal.FilmDAO;
import entities.Film;

public class FilmBLL {
	private FilmDAO dao;
	
	public FilmBLL() {
		dao = new FilmDAO();
	}
	
	public List<Film> select() {
		return dao.select();
	}
	
	public Film selectById(int id) {
		return dao.selectById(id);
	}
	
	public void insert(Film film) {
		dao.insert(film);
	}
	
	public void update(Film film) {
		dao.update(film);
	}
	
	public void delete(Film film) {
		dao.delete(film);
	}
	
}
