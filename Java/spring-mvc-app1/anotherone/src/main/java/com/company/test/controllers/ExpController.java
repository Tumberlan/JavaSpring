package com.company.test.controllers;


import com.company.test.structs.Expression;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("third")
public class ExpController
{
    @GetMapping("/square")
    public String getExpression(Model model){
        model.addAttribute("expression", new Expression());
        return "third/calc-page";
    }

    @PostMapping("/square")
    public String submitExpression(@ModelAttribute Expression expression, Map<String, Object> map){


        Double number = expression.getExpression();
        double result = number*number;

        map.put("result", "result: " + result);
        return "third/calc-page";
    }
}
