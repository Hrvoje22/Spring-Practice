package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //has @Component inside
public class HomeController {

    @RequestMapping("/home")
    public String home(){ // end point mapping with requestMapping - exp www.amazon/home
        return "home.html";
    }

    @RequestMapping("/h")
    public String home2(){ // end point mapping with requestMapping - exp www.amazon/home
        return "home.html";
    }

    @RequestMapping({"/apple","/orange"})
    public String home3(){ // end point mapping with requestMapping - exp www.amazon/home
        return "home.html";
    }



}
