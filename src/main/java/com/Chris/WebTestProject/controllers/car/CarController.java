package com.Chris.WebTestProject.controllers.car;


import com.Chris.WebTestProject.dao.GetServices;
import com.Chris.WebTestProject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/rest")
@Controller
public class CarController {

    @Autowired
    GetServices services;

    @GetMapping("/get")
    public ModelAndView get(ModelAndView model){
       model.setViewName("get");
       model.addObject("listOfCars",services.getCarList());
       return model;
    }

    @RequestMapping("/addform")
    public String addForm(){
        return "post";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("car") Car car,ModelAndView model){
        model.setViewName("post");
        model.addObject("status",services.add(car));
        return model;
    }


}

