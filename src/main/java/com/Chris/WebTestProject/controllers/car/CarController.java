package com.Chris.WebTestProject.controllers.car;


import com.Chris.WebTestProject.dao.CarJdbcDAO;
import com.Chris.WebTestProject.dao.DAO;
import com.Chris.WebTestProject.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class CarController {

    private static DAO<Car> dao;

    public CarController(DAO<Car> dao){
        this.dao = dao;
    }


    @RequestMapping("/data")
    public ModelAndView dataList(ModelAndView m){
        List<Car> cars = dao.list();
        m.setViewName("indexH2");
        m.addObject("listOfCars",cars);
        return m;
    }

}
