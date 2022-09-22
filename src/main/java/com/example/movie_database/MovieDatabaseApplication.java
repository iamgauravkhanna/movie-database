package com.example.movie_database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MovieDatabaseApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MovieDatabaseApplication.class, args);

		System.out.println("No. of Beans :: " + context.getBeanDefinitionCount());

		String[] beanDef = context.getBeanDefinitionNames();

		//Arrays.asList(beanDef).forEach(System.out::println);

	}

}