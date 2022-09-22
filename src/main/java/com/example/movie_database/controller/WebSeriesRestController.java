package com.example.movie_database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie_database.service.WebSeriesService;

@RestController
public class WebSeriesRestController {
	
	@Autowired
	WebSeriesService webSeriesService ;
	
	@GetMapping("/webseries")
	public ResponseEntity<Object> getSeries(){
		
		return new ResponseEntity<Object>(webSeriesService.getWebSeries(), HttpStatus.ACCEPTED);
		
	}

}
