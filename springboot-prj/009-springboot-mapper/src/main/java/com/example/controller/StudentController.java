package com.example.controller;

import com.example.Demo.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public String select(Integer id){
        return studentService.selectById(id).toString();
    }
}
