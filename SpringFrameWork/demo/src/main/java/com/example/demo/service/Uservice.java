package com.example.demo.service;


import com.example.demo.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Uservice {

    @Value("${app.name}")
    public String s;

    @Autowired
    AppConfig appConfig;

    public String getName(){
        System.out.println(appConfig.getName() +" "+appConfig.getPort());
      return s;
    }

}
