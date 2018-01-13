package com.sda.springstarter.demo.model;


import com.sda.springstarter.demo.interfaces.ModelEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "wydawca")
public class Publisher implements ModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    private Set<Book> book;

    public Publisher() {
    }

    public Publisher(String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
