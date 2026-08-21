package com.springboot.myFirstLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Animal {
    @Autowired
    private Dog dog;

    @GetMapping("/ok")
    public String type(){
        return dog.breed();
    }

}
