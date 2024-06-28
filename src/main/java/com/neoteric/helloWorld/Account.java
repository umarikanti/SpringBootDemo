package com.neoteric.helloWorld;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Account {

    public  Account(){
        System.out.println("hello from account");
    }
    @Bean
    @ConditionalOnMissingBean
    public AccountService myService() {
        return new AccountService();
    }

}
