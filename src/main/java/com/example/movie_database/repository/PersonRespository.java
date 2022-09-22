package com.example.movie_database.repository;

import java.util.List;

import com.example.movie_database.model.Person;

public interface PersonRespository {
	
	Person save(Person person);
	
	List<Person> findAll();

}