package bll;

import java.util.List;

import bo.User;
import dal.UserDAO;

public class UserBLL {
	private UserDAO dao;
	
	public UserBLL() {
		dao = new UserDAO();
	}
	
	public List<User> select() {
		return dao.select();
	}
	
	public User selectById(int id) {
		return dao.selectById(id);
	}
	
	public void insert(User user) {
		dao.insert(user);
	}
	
	public void update(User user) {
		dao.update(user);
	}
	
	public void delete(User user) {
		dao.delete(user);
	}
	
}
