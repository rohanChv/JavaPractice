package com.example.BasicAuthFlow.controller;

import com.example.BasicAuthFlow.Service.JWTUtil;
import com.example.BasicAuthFlow.model.LoginObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
public class LoginController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JWTUtil jwtUtil;

    @GetMapping("/userLogin")
    public ResponseEntity<String> login(@RequestBody LoginObject loginObject){
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginObject.getUserName(),loginObject.getPassword()));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(jwtUtil.generateToken(loginObject.getUserName()),HttpStatus.ACCEPTED);
    }

    @GetMapping("/token")
    public ResponseEntity<String> login(@RequestBody String token){
        String s;
        try {
           s= jwtUtil.getUsername(token);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(s,HttpStatus.ACCEPTED);
    }


}
