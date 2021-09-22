package com.Chris.WebTestProject.controllers.car;


import com.Chris.WebTestProject.dao.CarRepo;
import com.Chris.WebTestProject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

    @Autowired
    CarRepo repo;

    @RequestMapping("/add")
    public String jpaHome(){
        return "create";
    }

    @RequestMapping("/create")
    public String add(Car car){
        repo.save(car);
        return "create";
    }
}
