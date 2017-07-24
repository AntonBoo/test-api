package fr.teamnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.teamnet.entity.Movie;
import fr.teamnet.service.MovieService;


@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "ok ça marche";
	}

	@RequestMapping(value="/movie/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Movie getMovie(@PathVariable int id) {
		return movieService.findOne(id);
	}
	
	@RequestMapping(value="/movie", method = RequestMethod.GET)
	@ResponseBody
	public List<Movie> getAllMovies() {
		return movieService.findAll();
	}
	
	@RequestMapping(value="/movie", method = RequestMethod.POST)
	@ResponseBody
	public void addMovie(@RequestBody Movie movie) {
		movieService.save(movie);
	}
	
}