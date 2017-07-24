package fr.teamnet.service;

import java.util.List;

import fr.teamnet.entity.Movie;

public interface MovieService {
	
	public void save(Movie movie);
	public Movie findOne(Integer id);
	public List<Movie> findAll();
	
	

}
