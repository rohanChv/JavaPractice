package com.example.SecurityPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AuthenticationManager authenticationManager;

    @GetMapping("/authenticate/")
    public String sayHello(@RequestParam(value = "userName")String userName,@RequestParam(value="password")String password ){
        Authentication auth=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName,password));
        return String.valueOf(auth);
    }
}
