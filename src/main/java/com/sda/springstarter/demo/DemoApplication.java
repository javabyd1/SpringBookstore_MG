package com.sda.springstarter.demo;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.repository.AuthorRepository;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private BookServiceImpl bookService;

	@Autowired
	private AuthorServiceImpl authorService;

	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book1 = new Book("Tytul", "Autor");
		Book book2 = new Book("Tytul2", "Autor2");

//		bookService.saveBook(book1);
//		bookService.saveBook(book2);

//		Author author = authorRepository.f

	}
}
