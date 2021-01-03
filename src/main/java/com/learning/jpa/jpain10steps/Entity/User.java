package com.learning.jpa.jpain10steps.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Store it in a table called User
@Entity
public class User {

    private String  name;
    private String role;

    @Id
    @GeneratedValue
    private long id;



    protected User() {

    }

    public User( String name, String role) {
        this.name = name;
        this.role = role;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
