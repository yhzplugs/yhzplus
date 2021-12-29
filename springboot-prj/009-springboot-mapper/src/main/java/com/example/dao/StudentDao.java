package com.example.dao;

import com.example.Demo.Student;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface StudentDao {
    public Student selectById(Integer id);
}
