package com.example.dailypaper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/firstElement")
    public String firstElement(){
        return "btCopy";
    }

}
