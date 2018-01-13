package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
