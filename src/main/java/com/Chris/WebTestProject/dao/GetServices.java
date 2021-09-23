package com.Chris.WebTestProject.dao;

import com.Chris.WebTestProject.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class GetServices {

    public List<Car> carList(){
        List listOfCars = List.of(
                new Car(1,"Toyota","Blue",2000),
                new Car(2,"Hyundai","Blue",2000),
                new Car(3,"Honda","Red",2000)
        );
        return listOfCars;
    }

    public List<Car> getCarById(int id){
        return carList().stream().filter(car -> car.getId() == id).collect(Collectors.toList());
    }
}
