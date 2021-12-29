package com.example;

import com.example.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        System.out.println(1);
        SpringApplication.run(Application.class, args);
        System.out.println(2);
    }

    @Override
    public void run(String... args) throws Exception {
        String s=helloService.hello("lisi");
        System.out.println(s);
        System.out.println(3);
    }
}
