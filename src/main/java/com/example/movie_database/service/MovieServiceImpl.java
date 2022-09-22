package com.example.movie_database.service;

import java.util.List;
import java.util.Optional;

import com.example.movie_database.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie_database.dao.MovieDAOImpl;
import com.example.movie_database.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private MovieDAOImpl movieDAOImpl;

	public List<Movie> getMovie() {

		return (List<Movie>)movieRepository.findAll();

	}

	public List<Movie> getMovieByName(String name) {

		return (List<Movie>)movieRepository.findByNameContaining(name);

	}

	public Optional<Movie> getMovieById(int id) {

		return this.movieRepository.findById(id);
	}

	public Movie saveMovie(Movie movie) {

		return movieRepository.save(movie);

	}

	public void saveMovieViaDao(Movie movie) {

		movieDAOImpl.save(movie);

	}

	public void deleteMovie(int id) {

		movieRepository.deleteById(id);

	}

}
