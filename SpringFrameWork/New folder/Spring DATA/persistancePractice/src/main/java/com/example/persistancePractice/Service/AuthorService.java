package com.example.persistancePractice.Service;

import com.example.persistancePractice.Model.Author;
import com.example.persistancePractice.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public Author getAuthor(){
        return new Author();
    }

    public void addAuthor(Author auth){
       authorRepository.save(auth);
    }
}
