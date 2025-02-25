package bll;

import java.time.LocalDate;
import java.util.List;

import bo.PostIt;
import dal.PostItDAO;

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
		postIt.setDateCreation(LocalDate.now());
		dao.insert(postIt);
	}
	
	public void update(PostIt postIt) {
		PostIt old = selectById(postIt.getId());
		old.setTitre(postIt.getTitre());
		old.setContenu(postIt.getContenu());
		old.setDateModification(LocalDate.now());
		dao.update(old);
	}
	
	public void delete(PostIt postIt) {
		dao.delete(postIt);
	}
}
