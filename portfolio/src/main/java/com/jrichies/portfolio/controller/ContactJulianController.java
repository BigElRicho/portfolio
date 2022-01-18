package com.jrichies.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactJulianController {

    @GetMapping("/contactJulian")
    public String contactJulian(){
        return "contactJulian";
    }
}

