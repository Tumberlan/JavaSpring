package com.company.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class CalcController {


    @GetMapping("/calc")
    public String calcMain(Model model){
        return "calc-page";
    }
}
