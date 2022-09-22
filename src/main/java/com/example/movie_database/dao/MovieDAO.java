package com.example.movie_database.dao;

import java.util.List;

import com.example.movie_database.model.Movie;
import org.springframework.stereotype.Component;

@Component
//CRUD operations
public interface MovieDAO {

	// Create
	public void save(Movie movie);

	// Read
	public Movie getById(int id);

	// Update
	public void update(Movie movie);

	// Delete
	public void deleteById(int id);

	// Get All
	public List<Movie> getAll();

}