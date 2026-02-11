package com.rohan.example.controller;

import com.rohan.example.model.User;
import com.rohan.example.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
public class UserController {

    @Autowired
    UserRepository repo;

    @Value("${hello}")
    String message;

    @GetMapping("/getAndUpdate/{Id}/{newEmail}")
    public String getUpdate(@PathVariable("Id")Integer Id,@PathVariable("newEmail")String email){
       User u=repo.findById(Id).get();
       u.setEmail(email);
       repo.save(u);

       return message+email;
    }

}
