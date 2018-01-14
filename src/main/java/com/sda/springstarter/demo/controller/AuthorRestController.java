package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorRestController {

    @Autowired
    private AuthorServiceImpl authorService;

    @GetMapping
    public List<Author> getAll(){
        return authorService.getAll();
    }

    @PostMapping("/addoneauthor")
    public void add(Author author) {
        authorService.save(author);
    }



}
