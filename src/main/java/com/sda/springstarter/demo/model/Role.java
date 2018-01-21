package com.sda.springstarter.demo.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty(message = "Enter role description")
    private String description;


}
