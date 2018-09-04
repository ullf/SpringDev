package ru.markblog;

import org.springframework.stereotype.Component;

@Component
public class ExampleA {

    private String name;
    private ExampleB exampleB;

    public ExampleA(){

    }

    public ExampleA(ExampleB b){
        this.exampleB=b;
    }

    public void print(){
        System.out.println(exampleB.getName());
    }

    public ExampleB getExampleB() {
        return exampleB;
    }

    public void setExampleB(ExampleB exampleB) {
        this.exampleB = exampleB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
