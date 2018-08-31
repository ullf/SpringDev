package ru.markblog;

import org.springframework.stereotype.Component;

@Component
public class B {

    private String name;

    public B(){
        System.out.println("B constructor!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
