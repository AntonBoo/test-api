package fr.teamnet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.teamnet.entity.Movie;

@Repository
public class MovieDAOImpl implements MovieDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Movie movie) {
		sessionFactory.getCurrentSession().save(movie);
	}

	@Override
	public Movie findOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Movie.class,id);
	}

	@Override
	public List<Movie> findAll() {
		return (List<Movie>) sessionFactory.getCurrentSession().createQuery("select m from Movie m").list();
	}

}
