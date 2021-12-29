package com.example.service;

import com.example.Demo.Student;
import com.example.dao.StudentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService implements StudentDao {

    @Resource
    StudentDao studentDao;

    @Override
    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }
}
