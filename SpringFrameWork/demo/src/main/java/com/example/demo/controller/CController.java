package com.example.demo.controller;

import com.example.demo.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CController {

    @Autowired
    Uservice uservice;

    @GetMapping(value="/getData",params = "2xx")
    public String getData2(){
        return "->200(Accepted),201(new Resource Created),202(Accepted, not proccessed),204(Successful, No Response)";
    }

    @GetMapping(value="/getData",params = "3xx")
    public String getData3(){

        return "301(temporarily moved),302(redirected),304(Not Modified(cached))";
    }

    @GetMapping(value="/getData",params = "4xx")
    public ResponseEntity<String> getData4(){

        return ResponseEntity.status(HttpStatus.CREATED).body("400(Bad Request),401(not authorized),403(forbidden),404(page not found),405(Not Allowed)");
    }
    @GetMapping(value="/getData",params = "5xx")
    public String getData5(){

        return "500(Internal Server Error),502(Bad Gateway),503(service not available),504(Timeout Error)";
    }

}
