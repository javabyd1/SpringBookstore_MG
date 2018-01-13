package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.GenericService;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PublisherServiceImpl implements GenericService <Publisher> {

    @Autowired
    PublisherRepository publisherRepository;

    @Override
    public List<Publisher> getAll() {
        return publisherRepository.findAll();
    }

    @Override
    public void save(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public void saveAll(Set<Publisher> publishers) {
        publisherRepository.save(publishers);
    }
}
