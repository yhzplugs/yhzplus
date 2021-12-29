package com.example.service.impl;

import com.example.dao.StudentMapper;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;

    @Transactional
    @Override
    public int addStudent(Student student) {
        //int i=10/0;
        return studentMapper.insertSelective(student);
    }
}
