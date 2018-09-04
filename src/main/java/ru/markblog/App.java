package ru.markblog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        ExampleA a=(ExampleA)context.getBean("A");
        System.out.println(a.getName());
        a.print();
    }
}
