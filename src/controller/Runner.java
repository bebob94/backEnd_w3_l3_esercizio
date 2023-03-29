package controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import model.evento;

public class Runner {
	
	
	public static void main(String[] args) {
		
		// <<<<<<<<<<<<<<<<<<<<<<<<<< CREAZIONE EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
			evento evento1 = new evento("compleanno", LocalDate.of(2020, 3, 27), "compleanno Bebo", TipoEvento.PUBBLICO, 2);
			evento evento2 = new evento("funerale", LocalDate.of(2020, 3, 23), "funerale Bebo", TipoEvento.PUBBLICO, 10);
			evento evento3 = new evento("promozione", LocalDate.of(2020, 3, 27), "promozione lavoro Bebo", TipoEvento.PRIVATO, 20);
		try {
//					
			// <<<<<<<<<<<<<<<<<<<<<<<<<< AGGIUNGI EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
			evento_DAO.save(evento1);
			evento_DAO.save(evento2);
			evento_DAO.save(evento3);
//			
			// <<<<<<<<<<<<<<<<<<<<<<<<<< LETTURA EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
//			evento e1=evento_DAO.getById(1);
//			evento e2=evento_DAO.getById(2);
//			evento e3=evento_DAO.getById(3);
			
			// <<<<<<<<<<<<<<<<<<<<<<<<<< ELIMINAZIONE EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
//			evento_DAO.delete(e1);
//			evento_DAO.delete(e2);
//			evento_DAO.delete(e3);
			
			// <<<<<<<<<<<<<<<<<<<<<<<<<< MODIFICA EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
//			e1.setTipo_evento("PUBBLICO");
//			evento_DAO.updateEvento(e1);
			
			// <<<<<<<<<<<<<<<<<<<<<<<<<< REFRESH EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
//			evento_DAO.refresh(e);
			
			// <<<<<<<<<<<<<<<<<<<<<<<<<< LETTURA EVENTI >>>>>>>>>>>>>>>>>>>>>>>>>>
//			System.out.println(evento_DAO.leggiEventi());
//			
			List<evento> lista = evento_DAO.leggiEventi();
			lista.forEach(ev -> System.out.println(ev));
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

}
