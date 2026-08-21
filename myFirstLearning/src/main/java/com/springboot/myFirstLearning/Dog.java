package com.springboot.myFirstLearning;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public String breed(){
        return "German Shepherd";
    }
}
