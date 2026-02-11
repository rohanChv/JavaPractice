package com.example.JDBC.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MSGController {
    @GetMapping("/message")
    public String greetUser(@RequestParam String msg){
        return "User Says => "+msg;
    }
    @GetMapping("/greet/{msg}")
    public String getMessage(@PathVariable String msg){
        return "User Says => "+msg;
    }
}
