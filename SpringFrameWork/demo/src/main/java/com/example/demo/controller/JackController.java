package com.example.demo.controller;

import com.example.demo.dto.requestDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/json")
public class JackController {
    @PostMapping("/post")
    public void postString(@RequestBody String req) throws JsonProcessingException {
        ObjectMapper o=new ObjectMapper();
        requestDTO r= o.readValue(req, requestDTO.class);
        System.out.println(o.writeValueAsString(r));
    }
}
