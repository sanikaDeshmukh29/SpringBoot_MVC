package com.sprk.SpringBoot_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {

    @GetMapping("/demo")
    public String showDemo(){
        return "demo";
    }
}
