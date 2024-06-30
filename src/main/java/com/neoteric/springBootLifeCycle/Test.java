package com.neoteric.springBootLifeCycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Test {


        public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(Test.class, args);

            // Close the context to trigger bean destruction
            context.close();
        }
}

