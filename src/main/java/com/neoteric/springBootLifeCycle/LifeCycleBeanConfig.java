package com.neoteric.springBootLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.neoteric.springBootLifeCycle")
public class LifeCycleBeanConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public LifeCycle lifecycleBean() {
        LifeCycle bean = new LifeCycle();
        bean.setSomeProperty("Example property");
        return bean;
    }

}
