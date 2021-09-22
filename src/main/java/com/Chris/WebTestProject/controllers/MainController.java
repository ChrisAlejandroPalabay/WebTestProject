package com.Chris.WebTestProject.controllers;



import com.Chris.WebTestProject.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    public String homePage() {
        return "car";
    }


    @RequestMapping("/car")
    public ModelAndView carForm(@ModelAttribute Car car, ModelAndView mv) {
        mv.setViewName("carResult");
        mv.addObject("car",car);
        return mv;
    }

   @RequestMapping("/list")
    public Model list(Model model){
        List carlist= List.of(
                new Car("Ford","White",2000),
                new Car("Toyota","Black",2013));
        model.addAttribute("carList",carlist);
        return model;
   }
}
