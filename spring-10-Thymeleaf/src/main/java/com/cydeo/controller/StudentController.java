package com.cydeo.controller;


import com.cydeo.boostrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    //localhost:8080/student/register
    @RequestMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }



    //localhost:8080/student/welcome?name=Ozzy
    @RequestMapping("/welcome")
    public String welcome(@RequestParam String name){

        System.out.println(name);

        return "student/welcome";
    }



}
