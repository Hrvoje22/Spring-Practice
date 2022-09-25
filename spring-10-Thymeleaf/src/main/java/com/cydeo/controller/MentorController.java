package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    //localhost:8080/mentor/register
    @RequestMapping("/register")
    public String register(){



        return "student/register";
    }

    //localhost:8080/mentor/drop
    @RequestMapping("/drop")
    public String drop(){



        return "student/register";
    }



}

