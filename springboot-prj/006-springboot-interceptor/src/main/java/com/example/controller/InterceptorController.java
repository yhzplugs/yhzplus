package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterceptorController {

    @RequestMapping("/user/admin")
    @ResponseBody
    public String addinter(){

        return "0hello";
    }

    @RequestMapping("/user/hello")
    @ResponseBody
    public String addinterceptor(){

        return "inter";
    }
}
