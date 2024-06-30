package com.neoteric.springBootLifeCycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean , DisposableBean , BeanNameAware {
    private String beanName;

    public LifeCycle() {
        System.out.println("1. Bean is instantiated");
    }
    public void setSomeProperty(String someProperty) {
        System.out.println("2. Setter injection of property: " + someProperty);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("6. DisposableBean's destroy method called");

    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("3. BeanNameAware's setBeanName method called. Bean name: " + name);

    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4. InitializingBean's afterPropertiesSet method called");

    }
    // Custom init method
    public void customInit() {
        System.out.println("5. Custom init method called");
    }
    // Custom destroy method
    public void customDestroy() {
        System.out.println("7. Custom destroy method called");
    }



}
