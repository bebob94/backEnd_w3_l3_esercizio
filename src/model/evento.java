package model;

import java.io.Serializable;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.persistence.*;

import controller.TipoEvento;

@Entity
@NamedQuery(name = "evento.findAll", query = "SELECT e FROM evento e")
public class evento implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_evento")
	private Integer id;
	private String titolo;
	private LocalDate date;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private TipoEvento tipo_evento;
	private Integer numero_massimo_partecipanti;
	

	// <<<<<<<<<<<<<<<<<<<<<<<<<< CREAZIONE EVENTO >>>>>>>>>>>>>>>>>>>>>>>>>>
		 public evento(String titolo, LocalDate date, String descrizione, TipoEvento tipo_evento, Integer numero_massimo_partecipanti){
			setTitolo(titolo);
			setDate(date);
			setDescrizione(descrizione);
			setTipo_evento(tipo_evento);
			setNumero_massimo_partecipanti(numero_massimo_partecipanti);
		}
	
	public Integer getId() {
		return id;
	}
	public evento() {
		super();
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public TipoEvento getTipo_evento() {
		return tipo_evento;
	}
	public void setTipo_evento(TipoEvento tipo_evento2) {
		this.tipo_evento = tipo_evento2;
	}
	public Integer getNumero_massimo_partecipanti() {
		return numero_massimo_partecipanti;
	}
	public void setNumero_massimo_partecipanti(Integer numero_massimo_partecipanti) {
		this.numero_massimo_partecipanti = numero_massimo_partecipanti;
	}
	
	@Override
	public String toString() {
		return "evento [id=" + id + ", titolo=" + titolo + ", date=" + date + ", descrizione=" + descrizione
				+ ", tipo_evento=" + tipo_evento + ", numero_massimo_partecipanti=" + numero_massimo_partecipanti + "]";
	}
}
