package ru.marksblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Для изучния
@Entity
public class Product {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    public Product(){
            
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
