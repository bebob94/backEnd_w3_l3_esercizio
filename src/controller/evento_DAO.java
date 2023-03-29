package controller;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.evento;
import utils.JpaUtil;

public class evento_DAO {
	
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	
	
	// <<<<<<<<<<<<<<<<<<<<<<<<<< AGGIUNGI EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
	 public static void save(Object evento) throws SQLException {
			em.getTransaction().begin();
			em.persist(evento);
			em.getTransaction().commit();
			System.out.println("Evento salvato nel database");
		}
		
	// <<<<<<<<<<<<<<<<<<<<<<<<<< LETTURA EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
	 public static evento getById(Integer id) throws SQLException {
			em.getTransaction().begin();
			evento e = em.find(evento.class, id);
			em.getTransaction().commit();
			System.out.println(e);
			return e;
		}
	 
	// <<<<<<<<<<<<<<<<<<<<<<<<<< ELIMINAZIONE EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
		public static void delete(evento e) throws SQLException {
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			System.out.println("Utente eliminato nel database");
		}
		
	// <<<<<<<<<<<<<<<<<<<<<<<<<< MODIFICA EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
	public static void updateEvento(evento e) throws SQLException {
			em.getTransaction().begin();
			em.merge(e);
			em.getTransaction().commit();
			System.out.println("Utente modificato nel database");
			System.out.println(e);
		}
		
	// <<<<<<<<<<<<<<<<<<<<<<<<<< REFRESH EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
		public static void refresh(evento e) throws SQLException {
			em.getTransaction().begin();
			em.refresh(e);
			em.getTransaction().commit();
			System.out.println("dati refreshati nel database");
		}
		
		// <<<<<<<<<<<<<<<<<<<<<<<<<< LETTURA EVENTI >>>>>>>>>>>>>>>>>>>>>>>>>>
		public static List<evento> leggiEventi() throws SQLException {
			Query q = em.createNamedQuery("evento.findAll");
			System.out.println("lettura eventi!!");
			return q.getResultList();
		}
}
