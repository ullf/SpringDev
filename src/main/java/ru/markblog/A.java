package ru.markblog;

import org.springframework.stereotype.Component;

@Component
public class A {

    private String name;
    private B b;

    public A(B b){
        this.b=b;
    }

    public void print(){
        System.out.println(b.getName());
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
