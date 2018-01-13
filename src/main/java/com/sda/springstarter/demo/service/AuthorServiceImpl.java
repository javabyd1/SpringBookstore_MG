package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.GenericService;
import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AuthorServiceImpl implements GenericService<Author> {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void saveAll(Set<Author> authors) {
        authorRepository.save(authors);
    }
}
