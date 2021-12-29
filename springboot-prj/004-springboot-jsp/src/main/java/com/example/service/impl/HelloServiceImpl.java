package com.example.service.impl;

import com.example.service.HelloService;
import org.springframework.stereotype.Service;

@Service("hello")
public class HelloServiceImpl implements HelloService {
    @Override
    public void hello(String name) {
        System.out.println("hello"+name);
    }
}
