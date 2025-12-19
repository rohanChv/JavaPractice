package com.example.persistancePractice.Controller;

import com.example.persistancePractice.Model.Author;
import com.example.persistancePractice.Repository.AuthorRepository;
import com.example.persistancePractice.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @Autowired
    AuthorService auth;


    @GetMapping("/getAuthor")
    public Author authorGet(){
        return auth.getAuthor();
    }

    @PostMapping("/addAuthor")
    public void authorGet(@RequestBody Author author){
        auth.addAuthor(author);
    }
}
