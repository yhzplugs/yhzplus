package com.example.service.impl;

import com.example.service.HelloService;
import org.springframework.stereotype.Service;

@Service("hello")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "name"+name;
    }
}
