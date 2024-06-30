package com.neoteric.SpringDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.neoteric.SpringDemo")
public class SpringDemoConfug {
    @Bean
    public HelloBeanService helloConfig(){
        return  new HelloBeanService();
    }

}
