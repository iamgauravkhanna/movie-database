package com.example.movie_database.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.movie_database.model.WebSeries;

@Repository
public interface WebSeriesRepository extends MongoRepository<WebSeries, String>{

}
