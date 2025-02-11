package dal;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TransactionRequiredException;

import bo.User;

public class UserDAO {
	private EntityManagerFactory emf;
	
	public UserDAO() {
		emf = Persistence.createEntityManagerFactory("SQLServer");
	}
	
	public List<User> select() {
		EntityManager em = emf.createEntityManager();
		List<User> resultat = em.createQuery("from User", User.class).getResultList();
		em.close();
		return resultat;
	}
	
	public User selectById(int id) {
		EntityManager em = emf.createEntityManager();
		User resultat = em.find(User.class, id);
		em.close();
		return resultat;
	}
	
	public void insert(User user) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.persist(user);
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	public void update(User user) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.merge(user);
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	public void delete(User user) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.remove(em.merge(user));
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
}
