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
        carList.add(new Car("Mazda","Gray",2020));
        carList.add(new Car("Honda","Blue",2021));
        for (int i=0;i < carList.size();i++){
            carList.get(i).setId(i);
        }
        return carList;
    }

    private List<Car> carList = loadList();

    public List<Car> getCarList(){
        return carList;
    }

    public String add(Car car){
        carList.add(car);
        return "Add Successful";
    }


}
