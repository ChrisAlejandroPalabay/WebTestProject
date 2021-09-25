package com.Chris.WebTestProject.dao;

import com.Chris.WebTestProject.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetServices {

    private List<Car> loadList(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1,"Honda","Blue",2020));
        carList.add(new Car(1,"Honda","Blue",2020));
        return carList;
    }

    private List<Car> carList = loadList();

    public List<Car> getList(){
        return carList;
    }

    public List<Car> getById(int id){
        return carList.stream().filter(car -> car.getId() == id).collect(Collectors.toList());
    }

    public String add(Car car){
        carList.add(car);
        return "Added Successfully";
    }

    public String delete(int id){
        for (Car car : carList){
            if (car.getId() == id){
                carList.remove(car);
            }
        }
        return "Deleted Successfully!";
    }
}
