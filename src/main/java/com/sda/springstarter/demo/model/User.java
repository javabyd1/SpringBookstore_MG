package com.sda.springstarter.demo.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "Enter e-mail address")
    @Email(message = "Enter correct e-mail address")
    private String email;

    @NotEmpty(message = "Enter your password")
    @Length(min = 8, message = "Password have to contain minimum 8 characters")
    private String password;

    @NotEmpty(message = "Enter your name")
    private String firstName;

    @NotEmpty(message = "Enter your surname")
    private String lastName;

    private int active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")   )
    private Set<Role> roles;
}