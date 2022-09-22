package com.example.movie_database.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie_database.model.Movie;
import com.example.movie_database.service.MovieService;

@RestController
@RequestMapping("/api/movie")
public class MovieRestController {

	@Autowired
	MovieService movieService;

	@GetMapping("/")
	public List<Movie> getMovies() {

		return this.movieService.getMovie();

	}
	
	@GetMapping("/listing")
	public ResponseEntity<Object> getMoviesListing() {

		return new ResponseEntity<Object>(this.movieService.getMovie(), HttpStatus.ACCEPTED);

	}

	@GetMapping("/{id}")
	public Optional<Movie> getMovieById(@PathVariable("id") int id) {

		return movieService.getMovieById(id);

	}
	
	@GetMapping("/by-id")
	public Optional<Movie> getMovieByIdUsingParam(@RequestParam int id){
		
		return movieService.getMovieById(id);
		
	}
	
	@GetMapping("/findByName/{name}")
	public List<Movie> getMovieByName(@PathVariable("name") String name){
		
		return movieService.getMovieByName(name);
		
	}

	@PostMapping("/")
	public Movie createMovie(@RequestBody Movie movie) {

		System.out.println(movie.toString());

		return this.movieService.saveMovie(movie);
	}

	@PutMapping("/")
	public Movie updateMovie(@RequestBody Movie movie) {

		return this.movieService.saveMovie(movie);

	}

	@DeleteMapping("/{id}")
	public void deleteMovie(@PathVariable("id") int id) {

		movieService.deleteMovie(id);

	}
	
	@GetMapping("/greeting")
	public ResponseEntity<String> greeting(@RequestHeader("accept-language") String language) {
	    // code that uses the language variable
	    return new ResponseEntity<String>(language, HttpStatus.OK);
	}

}
