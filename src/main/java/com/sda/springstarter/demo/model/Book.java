package com.sda.springstarter.demo.model;

import com.sda.springstarter.demo.interfaces.ModelEntity;

import javax.persistence.*;

@Entity
@Table(name = "ksiazki")
public class Book implements ModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;

    @ManyToOne
    private Publisher bookPublisher;

    @ManyToOne
    private BookCategory bookCategory;

    @ManyToOne
    private Author bookAuthor;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
    }

    public Publisher getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publisher bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
