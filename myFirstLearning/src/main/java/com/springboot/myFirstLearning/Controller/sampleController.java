package com.springboot.myFirstLearning.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

    @GetMapping("/testAPI")
    public String testingAPI(){
        return "API is running";
    }
}
