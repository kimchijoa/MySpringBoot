package com.kkh.homework.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @GetMapping("/hello")
    public String hellow(){
        return "hello";
    }
}
