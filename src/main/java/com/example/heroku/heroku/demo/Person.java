package com.example.heroku.heroku.demo;


import javax.persistence.Entity;

@Entity
public class Person {


    private Long id;
    private String name;

    private Person(){};

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
}
