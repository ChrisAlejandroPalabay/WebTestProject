package com.Chris.WebTestProject.Controllers;


import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;

@Controller
public class MainController {

    @RequestMapping("/")
    public String homePage(){
        return "home";
    }


    @RequestMapping("/hello")
    public ModelAndView hello(@RequestParam("name") String name, ModelAndView m){
        m.setViewName("hello");
        m.addObject("name",name);
        return m;
    }
}
