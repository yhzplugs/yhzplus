package com.example.Controller;

import com.example.vo.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BookController {

    @Resource
    private School school;

    @RequestMapping("/hello")
    @ResponseBody
    public String book(){
        return "hello";
    }

    @RequestMapping("/school")
    @ResponseBody
    public School school(){
        return school;
    }
}
