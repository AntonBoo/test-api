package fr.teamnet.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "module_esp8266")
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss:SSS", locale = "fr_FR")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private String libelle;
	private Integer valeur1;
	private Integer valeur2;

	public Module() {
		super();
	}

	public Module(Timestamp date, String libelle, Integer valeur1, Integer valeur2) {
		super();
		this.date = date;
		this.libelle = libelle;
		this.valeur1 = valeur1;
		this.valeur2 = valeur2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getValeur1() {
		return valeur1;
	}

	public void setValeur1(Integer valeur1) {
		this.valeur1 = valeur1;
	}

	public Integer getValeur2() {
		return valeur2;
	}

	public void setValeur2(Integer valeur2) {
		this.valeur2 = valeur2;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", date=" + date + ", libelle=" + libelle + ", valeur1=" + valeur1 + ", valeur2="
				+ valeur2 + "]";
	}
	
	

}
