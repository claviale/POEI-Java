package dal;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TransactionRequiredException;

import entities.Style;


public class StyleDAO {
	private EntityManagerFactory emf;
	
	public StyleDAO() {
		emf = Persistence.createEntityManagerFactory("SQLServer");
	}
	
	public List<Style> select() {
		EntityManager em = emf.createEntityManager();
		List<Style> resultat = em.createQuery("from Style", Style.class).getResultList();
		em.close();
		return resultat;
	}
	
	public Style selectById(int id) {
		EntityManager em = emf.createEntityManager();
		Style resultat = em.find(Style.class, id);
		em.close();
		return resultat;
	}
	
	public void insert(Style style) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.persist(style);
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	public void update(Style style) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.merge(style);
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	public void delete(Style style) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.remove(em.merge(style));
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
}
