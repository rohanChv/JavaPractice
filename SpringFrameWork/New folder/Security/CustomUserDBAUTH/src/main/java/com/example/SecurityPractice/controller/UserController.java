package com.example.SecurityPractice.controller;

import com.example.SecurityPractice.model.DBUser;
import com.example.SecurityPractice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/addUser")
    public void addUser(@RequestBody DBUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
    }

}
