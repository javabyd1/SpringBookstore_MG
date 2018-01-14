package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/books")
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping("/addonebook")
    public void save(@RequestBody Book book){
        bookService.save(book);
    }

    @PostMapping("/addmanybooks")
    public void save(@RequestBody Set<Book> books){
        bookService.saveAll(books);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookService.getBy(id));
    }

}