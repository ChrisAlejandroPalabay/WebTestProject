package com.Chris.WebTestProject.controllers.car;


import com.Chris.WebTestProject.dao.GetServices;
import com.Chris.WebTestProject.model.Car;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/get")
public class CarController {

    GetServices services = new GetServices();

    @GetMapping("/list")
    public List<Car> carList(){
       return services.carList();
    }

    @GetMapping("/getById/{id}")
    public List<Car> getById(@PathVariable int id){
        return services.getCarById(id);
    }

}
