package com.Chris.WebTestProject.repository;

import com.Chris.WebTestProject.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo extends JpaRepository<Car,Integer> {

}
