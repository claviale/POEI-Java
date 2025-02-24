package bll;

import java.util.List;

import bo.PostIt;
import dal.PostItDAO;
import exceptions.PostItException;

public class PostItBLL {
	private PostItDAO dao;
	
	public PostItBLL() {
		dao = new PostItDAO();
	}
	
	public List<PostIt> select() {
		return dao.select();
	}
	
	public PostIt selectById(int id) {
		return dao.selectById(id);
	}
	
	public void insert(PostIt postIt) {
		dao.insert(postIt);
	}
	
	public void update(PostIt postIt) {
		dao.update(postIt);
	}
	
	public void delete(PostIt postIt) {
		dao.delete(postIt);
	}
}
