package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.service.BookCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookCategories")
public class BookCategoryRestController {

    @Autowired
    private BookCategoryServiceImpl authorService;

    @RequestMapping(method = RequestMethod.GET)
    public List<BookCategory> getAll(){
        return authorService.getAll();
    }

}
