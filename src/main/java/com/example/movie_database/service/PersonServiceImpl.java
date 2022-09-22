package com.example.movie_database.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movie_database.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Person> getPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		
	}

//	@Autowired
	//@Qualifier("JdbcPersonRespository")
	//@Qualifier("NamedParameterJdbcPersonRespository")
//	PersonRespository personRespository;
//
//	@Override
//	public List<Person> getPerson() {
//
//		return (List<Person>) personRespository.findAll();
//
//	}
//
//	@Override
//	public void savePerson(Person person) {
//		
//		personRespository.save(person);
//		
//	}

}