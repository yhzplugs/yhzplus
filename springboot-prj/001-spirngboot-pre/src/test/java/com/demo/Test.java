package com.demo;

import com.demo.config.SpringConfig;
import com.demo.vo.Cat;
import com.demo.vo.Student;
import com.demo.vo.Tiger;
import org.springframework.cache.Cache;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    @org.junit.Test
    public void test(){
        String name="bean.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(name);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }

    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student= (Student) applicationContext.getBean("zhangStudent");
        System.out.println(student);
    }

    @org.junit.Test
    public void test2(){
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) applicationContext.getBean("myCat");
        System.out.println(cat);
    }

    @org.junit.Test
    public void test3(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) applicationContext.getBean("tiger");
        System.out.println(tiger);
    }
}
