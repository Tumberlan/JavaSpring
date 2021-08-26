package com.company.core.controllers;


import com.company.core.topics.CalcTopic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@Controller
public class MainController {

  /*  @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }
    @GetMapping("/calc")
    public String calc( Model model) {
        model.addAttribute("title", "Calculator");
        return "calc-page";
    }
*/

    @RequestMapping("/")
    public List<Integer> answer(){
        CalcTopic calcTopic = new CalcTopic(2);

        return Arrays.asList(calcTopic.getSquare());
    }

}
