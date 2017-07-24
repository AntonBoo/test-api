package fr.teamnet.dao;

import java.util.List;

import fr.teamnet.entity.Movie;

public interface MovieDAO {
	
	public void save(Movie movie);
	public Movie findOne(Integer id);
	public List<Movie> findAll();

}
