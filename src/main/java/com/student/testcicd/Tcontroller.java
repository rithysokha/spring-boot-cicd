package com.student.testcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class Tcontroller {
    @GetMapping
    public String hello(){
        return "<h1>CI/CD third attempt</h1>";
    }
}
