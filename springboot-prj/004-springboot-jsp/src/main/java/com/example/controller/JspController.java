package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JspController {

    @RequestMapping("/myjsp")
    public String jsp(Model model){
        model.addAttribute("data","JSP");
        return "index";
    }
}
