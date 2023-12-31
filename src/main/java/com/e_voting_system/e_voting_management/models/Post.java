package com.e_voting_system.e_voting_management.models;

import jakarta.persistence.*;

@Entity
public class Post {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name; 

    public Post(){

    }

    public Post(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
