package com.cydeo.controller;


import com.cydeo.boostrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    //localhost:8080/student/register
    //@RequestMapping(value = "/register", method= RequestMethod.GET)
    @GetMapping("/register") //same as requestMapping up
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }



    //localhost:8080/student/welcome?name=Ozzy
    @RequestMapping(value= "/welcome",method = RequestMethod.POST)
    @PostMapping("/welcome")
    public String welcome(){



        return "student/welcome";
    }



}
