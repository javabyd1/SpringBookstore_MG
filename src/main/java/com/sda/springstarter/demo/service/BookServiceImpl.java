package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.exceptions.BookNotFoundException;
import com.sda.springstarter.demo.interfaces.GenericService;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookServiceImpl implements GenericService<Book>{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBy(int id) {
        Book book = bookRepository
                .findById(id)
                .orElseThrow( () -> new BookNotFoundException(id) );
        return book;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
         bookRepository.save(book);
    }

    @Override
    public void saveAll(Set<Book> books) {
        bookRepository.save(books);
    }
}
