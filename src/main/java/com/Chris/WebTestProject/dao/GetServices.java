package com.Chris.WebTestProject.dao;

import com.Chris.WebTestProject.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetServices {

    public List<Car> loadCars(){
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car(1,"Toyota","Blue",2020));
        carList.add(new Car(2,"Honda","Red",2021));
        return carList;
    }

    private List<Car> cars = loadCars();

    public List<Car> getAllCars(){
        return cars;
    }

    public List<Car> getById(int id){
        return getAllCars().stream().filter(car -> car.getId() == id).collect(Collectors.toList());
    }


    public String addCar(Car car){
        cars.add(car);
        return "Add success!";
    }
}
