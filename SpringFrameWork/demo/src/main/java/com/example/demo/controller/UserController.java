package com.example.demo.controller;

import com.example.demo.dto.userDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping("/userRequest")
    public ResponseEntity<Object> postUser(@Valid @RequestBody userDTO user, BindingResult bindingResult){
        System.out.println(user.toString());
        if(bindingResult.hasErrors()){
            System.out.println("Hello");
            return ResponseEntity.status(400).body(bindingResult.getFieldErrors().get(0).getDefaultMessage());
        }
        return ResponseEntity.status(200).body("Added");
    }

}
