package com.Chris.WebTestProject;

import com.Chris.WebTestProject.dao.DAO;
import com.Chris.WebTestProject.model.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebTestProjectApplication {

	private static DAO<Car> dao;

	public WebTestProjectApplication(DAO<Car> dao){
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebTestProjectApplication.class, args);
		dao.create(new Car("Tesla","Blue",2020));
	}

}
