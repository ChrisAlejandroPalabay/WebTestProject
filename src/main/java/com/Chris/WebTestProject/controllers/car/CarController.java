package com.Chris.WebTestProject.controllers.car;


import com.Chris.WebTestProject.dao.CarRepo;
import com.Chris.WebTestProject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
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

    @RequestMapping("/list2")
    public ModelAndView data(ModelAndView m){
        List list = List.of(
                new Car("toyota","blue",2020),
                new Car("toyota","blue",2020),
                new Car("toyota","blue",2020));
        m.setViewName("list2");
        m.addObject("list",list);
        return m;
    }
}
