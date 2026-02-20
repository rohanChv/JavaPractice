package com.example.JPA_FINAL.controller;

import com.example.JPA_FINAL.model.Book;
import com.example.JPA_FINAL.model.Library;
import com.example.JPA_FINAL.repo.BookRepo;
import com.example.JPA_FINAL.repo.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    LibraryRepository libraryRepository;

    @Autowired
    BookRepo bookRepo;

    @PostMapping("/addBooks/{id}")
    public void addBooks(@RequestBody List<Book> bookList, @PathVariable("id") Integer id){
        Library lib=libraryRepository.findById(id).get();
        bookList.forEach(e->e.setLibrary(lib));
        bookRepo.saveAll(bookList);
    }

    @PostMapping("/addLibrary")
    public void addLibrary(@RequestBody List<Library> libraryList){
        libraryRepository.saveAll(libraryList);
    }

    @GetMapping("/getLibrary")
    public List<Library> getLibrary(@RequestBody List<Integer>id){
        return libraryRepository.getListByIDList(id);
    }
    @GetMapping("/getBooksById")
    public List<Book> getBooks(@RequestBody List<Integer>id){
        return bookRepo.findByLibraryId(id);
    }
    @GetMapping("/getAllBooks/{offset}/{limit}")
    public List<Book> getAllBooks(@PathVariable Integer offset,@PathVariable Integer limit){
        Pageable page= PageRequest.of(offset,limit, Sort.by("publicationYear").ascending());
        return bookRepo.findAll(page).getContent();
    }

    @GetMapping("/getLibraries")
    public Page<Library> getLibraries(){
        Pageable page=PageRequest.of(0,20,Sort.by("name").ascending());
        return libraryRepository.getAllLibraries(page);
    }
}
