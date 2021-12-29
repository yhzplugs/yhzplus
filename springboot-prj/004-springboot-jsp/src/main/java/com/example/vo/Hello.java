package com.example.vo;

import org.springframework.stereotype.Component;

@Component("hello1")
public class Hello {
    public void hello(String name){
        System.out.println("name"+name);
    }
}
