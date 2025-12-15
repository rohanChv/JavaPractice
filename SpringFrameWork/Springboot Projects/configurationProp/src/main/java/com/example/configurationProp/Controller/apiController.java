package com.example.configurationProp.Controller;

import com.example.configurationProp.Service.MakeRequest;
import com.example.configurationProp.Service.UrlReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class apiController {
    @Autowired
    MakeRequest req;

    @Autowired
    Environment env;

    @Value("${rohan.title}")
    String greet;

    @GetMapping("/user")
    public String getList() throws IOException {
        return req.makeConnection();
    }
    @GetMapping("/greet")
    public String greetUser() throws IOException {
        return greet+env.getProperty("spring.application.name");
    }
}
