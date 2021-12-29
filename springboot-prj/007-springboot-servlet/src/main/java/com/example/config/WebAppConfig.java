package com.example.config;

import com.example.web.MySerlvet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class WebAppConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MySerlvet(),"/myservlet");
        return bean;
    }
/*自定义字符集编码过滤器*/
    /*@Bean
    FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        CharacterEncodingFilter filter=new CharacterEncodingFilter();
        filter.setEncoding("utf-8");
        filter.setForceEncoding(true);
        filterRegistrationBean.setFilter(filter);
        return filterRegistrationBean;
    }*/
}
