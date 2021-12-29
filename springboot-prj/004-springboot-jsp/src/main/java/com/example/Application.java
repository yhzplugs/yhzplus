package com.example;

import com.example.service.HelloService;
import com.example.vo.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =SpringApplication.run(Application.class, args);
        HelloService hello = (HelloService) applicationContext.getBean("hello");
        hello.hello("lisi");
       /* Hello hello = (Hello) applicationContext.getBean("hello1");
        hello.hello("123");*/
    }

}
