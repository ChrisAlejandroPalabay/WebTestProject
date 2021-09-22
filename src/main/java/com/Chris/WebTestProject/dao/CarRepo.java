package com.Chris.WebTestProject.dao;

import com.Chris.WebTestProject.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car,Integer> {


}
