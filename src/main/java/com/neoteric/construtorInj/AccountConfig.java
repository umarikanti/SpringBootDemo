package com.neoteric.construtorInj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.neoteric.construtorInj")
public class AccountConfig {

    @Bean
    public  AccountDetils addMethod(){
        return  new AccountDetils();
    }
}
