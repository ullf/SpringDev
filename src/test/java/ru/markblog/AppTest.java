package ru.markblog;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.sun.glass.ui.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void beanTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        assertNotNull(context.getBean("A"));
        assertNotNull(context.getBean("B"));
        A a=(A)context.getBean("A");
        assertTrue(context.isPrototype("B"));
        assertNotNull(a.getName());
    }
}
