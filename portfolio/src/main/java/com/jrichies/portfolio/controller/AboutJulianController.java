package com.jrichies.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutJulianController {

    @GetMapping("/aboutJulian")
    public String aboutJulian(){
        return "aboutJulian";
    }
}
