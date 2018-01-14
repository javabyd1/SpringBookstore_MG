package com.sda.springstarter.demo.exceptions;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(int id) {
        super("Could not found book id=" + id);
    }

}
