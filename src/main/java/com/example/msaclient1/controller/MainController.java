package com.example.msaclient1.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/ms1/first")
    public String mainP(){
        return "main";
    }
}
