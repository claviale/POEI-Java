package dal;

import java.util.List;

import bo.PostIt;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TransactionRequiredException;

public class PostItDAO {
	private EntityManagerFactory emf;
	
	public PostItDAO() {
		emf = Persistence.createEntityManagerFactory("SQLServer");
	}
	
	public List<PostIt> select() {
		EntityManager em = emf.createEntityManager();
		List<PostIt> resultat = em.createQuery("from PostIt", PostIt.class).getResultList();
		em.close();
		return resultat;
	}
	
	public PostIt selectById(int id) {
		EntityManager em = emf.createEntityManager();
		PostIt resultat = em.find(PostIt.class, id);
		em.close();
		return resultat;
	}
	
	public void insert(PostIt postIt) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.persist(postIt);
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	public void update(PostIt postIt) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.merge(postIt);
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	public void delete(PostIt postIt) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.remove(em.merge(postIt));
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
}
