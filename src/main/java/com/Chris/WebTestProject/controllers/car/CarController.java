package com.Chris.WebTestProject.controllers.car;


import com.Chris.WebTestProject.dao.GetServices;
import com.Chris.WebTestProject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest")
public class CarController {

    @Autowired
    GetServices services;

    @GetMapping("/list")
    public List<Car> getList(){
        return services.getAllCars();
    }

    @GetMapping("/getById/{id}")
    public List<Car> getById(@PathVariable int id){
        return services.getById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String addCar(@RequestBody Car car){
        System.out.println(services.getAllCars());
        return services.addCar(car);
    }

}
