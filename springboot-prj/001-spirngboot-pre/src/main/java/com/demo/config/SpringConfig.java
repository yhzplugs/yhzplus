package com.demo.config;

import com.demo.vo.Student;
import org.springframework.context.annotation.*;

@Configuration
//导入其他配置文件
@ImportResource(value = "classpath:applationContext.xml")
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "com.demo.vo")
public class SpringConfig {

    @Bean(name = "zhangStudent")
    public Student creatStudent(){
        Student student=new Student();
        student.setAge(11);
        student.setSex("男");
        student.setName("张三");
        return student;
    }
}
