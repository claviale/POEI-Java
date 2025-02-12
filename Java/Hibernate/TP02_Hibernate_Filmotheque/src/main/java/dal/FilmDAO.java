package dal;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TransactionRequiredException;

import entities.Film;

public class FilmDAO {
	private EntityManagerFactory emf;
	
	public FilmDAO() {
		emf = Persistence.createEntityManagerFactory("SQLServer");
	}
	
	public List<Film> select() {
		EntityManager em = emf.createEntityManager();
		List<Film> resultat = em.createQuery("from Film", Film.class).getResultList();
		em.close();
		return resultat;
	}
	
	public Film selectById(int id) {
		EntityManager em = emf.createEntityManager();
		Film resultat = em.find(Film.class, id);
		em.close();
		return resultat;
	}
	
	public void insert(Film film) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.persist(film);
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	public void update(Film film) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.merge(film);
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
	public void delete(Film film) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try { 
			em.remove(em.merge(film));
			em.getTransaction().commit();
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
	
}
