package com.neoteric.SpringDemo;

import org.springframework.stereotype.Service;

@Service(value = "springHelloService")
public class SpringHelloService {
    public String sayHello(){
        return "from Bean Service";
    }
}
