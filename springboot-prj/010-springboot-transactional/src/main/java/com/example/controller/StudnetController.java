package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudnetController {
    @Resource
    StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public String addStudent(String name,Integer age){
        Student student=new Student();
        student.setAge(age);
        student.setName(name);
        int rows=studentService.addStudent(student);

        return "123"+rows;
    }
}
