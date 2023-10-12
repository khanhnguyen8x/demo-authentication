package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @GetMapping("/data")
    public String getData() {
        return "This is secure data";
    }

    @GetMapping("/data2")
    public String getData2() {
        return "This is secure data 2";
    }
}
