package fr.teamnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.teamnet.dao.MovieDAO;
import fr.teamnet.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDAO dao;

	@Transactional
	@Override
	public void save(Movie movie) {
		dao.save(movie);
	}

	@Transactional
	@Override
	public Movie findOne(Integer id) {
		return dao.findOne(id);
	}
	
	@Transactional
	@Override
	public List<Movie> findAll() {
		return dao.findAll();
	}

}
