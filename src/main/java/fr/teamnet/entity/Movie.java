package fr.teamnet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="movie")
public class Movie implements Serializable {
	
	public Movie() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", date=" + date + "]";
	}



	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss:SSS", locale = "fr_FR")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	public Movie(Integer id, String name, Date date) {
		this.id=id;
		this.name=name;
		this.date=date;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
