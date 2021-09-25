package com.Chris.WebTestProject.controllers.car;


import com.Chris.WebTestProject.dao.GetServices;
import com.Chris.WebTestProject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rest")
@RestController
public class CarController {

    @Autowired
    GetServices services;

    @GetMapping("/list")
    public List<Car> getList(){
        return services.getList();
    }

    @GetMapping("/getbyid/{id}")
    public List<Car> getById(@PathVariable int id){
       return services.getById(id);
    }

    @PostMapping("/add")
    public String add(@RequestBody Car car){
        return services.add(car);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return services.delete(id);
    }

}

