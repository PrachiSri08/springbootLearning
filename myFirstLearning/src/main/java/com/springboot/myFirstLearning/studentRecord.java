package com.springboot.myFirstLearning;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/studentdata")
public class studentRecord {
    HashMap<Integer, Student> map = new HashMap<>();
    @PostMapping
    public void studentName(@RequestBody Student stud){
        map.put(stud.getId(), stud);
    }
}
