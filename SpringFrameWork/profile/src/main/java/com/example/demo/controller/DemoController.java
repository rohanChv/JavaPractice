package com.example.demo.controller;

import com.example.demo.service.EnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    EnvService envService;

    @GetMapping("/getMessage")
    public String add(){
        return envService.getMessage();
    }

}
