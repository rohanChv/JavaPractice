package com.example.Locking.Controller;

import com.example.Locking.model.User;
import com.example.Locking.repo.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserInterface userInterface;

    @GetMapping("/getNullUserObject")
    public User getUser(){
        return new User();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User u){
        userInterface.save(u);
    }

}
