package com.example.demo.controller;

import com.example.demo.dto.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public ResponseEntity sayHello(){
        return new ResponseEntity("hello", HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity test(){
        Hello hello = new Hello("123","123123");
        return new ResponseEntity(hello, HttpStatus.OK);
    }
}
