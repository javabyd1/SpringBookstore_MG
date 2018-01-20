package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookCategoryServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private AuthorServiceImpl authorService;

    @Autowired
    private BookCategoryServiceImpl bookCategoryService;

    @Autowired
    private PublisherServiceImpl publisherService;

    @GetMapping(value = "booklist")
    public ModelAndView showBooks() {
        ModelAndView model = new ModelAndView();
        model.addObject("books", bookService.getAll());
        model.addObject("book", new Book());
        model.addObject("categories", bookCategoryService.getAll());
        model.addObject("publishers", publisherService.getAll());
        model.setViewName("booklist");
        return model;
    }

    @GetMapping(value = "authorlist")
    public ModelAndView showAuthors() {
        ModelAndView model = new ModelAndView();
        model.addObject("authors", authorService.getAll());
        model.setViewName("authorlist");
        return model;
    }
}
