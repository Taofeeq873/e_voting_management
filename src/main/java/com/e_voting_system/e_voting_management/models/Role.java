package com.e_voting_system.e_voting_management.models;

import jakarta.persistence.*;

@Entity
public class Role {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String name;


    public Role(){

    }

    public Role(String name) {
        this.name = name;
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

}
