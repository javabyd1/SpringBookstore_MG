package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.GenericService;
import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.repository.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BookCategoryServiceImpl implements GenericService<BookCategory> {

    @Autowired
    BookCategoryRepository bookCategoryRepository;

    @Override
    public List<BookCategory> getAll() {
        return bookCategoryRepository.findAll();
    }

    @Override
    public void save(BookCategory bookCategory) {
        bookCategoryRepository.save(bookCategory);
    }

    @Override
    public void saveAll(Set<BookCategory> booksCategories) {
        bookCategoryRepository.save(booksCategories);
    }
}
