package com.neoteric.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDemoConfug.class);
     //   HelloBeanService service = (HelloBeanService) ctx.getBean("springHelloService");
        SpringHelloService service1 = ctx.getBean("springHelloService",SpringHelloService.class);
        String byname = service1.sayHello();
        SpringHelloService service = new SpringHelloService();
        String bybeantype = service.sayHello();

        SpringHelloService springBeanService = new SpringHelloService();
        String coreJava = springBeanService.sayHello();

        System.out.println("by bean "+byname);
       System.out.println("by aname type"+bybeantype);
        System.out.println("core java"+coreJava);


    }

}
