package ru.markblog;

import org.springframework.stereotype.Component;

@Component
public class ExampleB {

    private String name;

    public ExampleB(){
        System.out.println("B constructor!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
