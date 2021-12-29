package com.example.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "account";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }
}
