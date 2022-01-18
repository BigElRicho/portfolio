package com.jrichies.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/aboutJulian")
    public String aboutJulian(){
        return "aboutJulian";
    }

    @GetMapping("/contactJulian")
    public String contactJulian(){
        return "contactJulian";
    }


}
