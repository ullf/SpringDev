package ru.markblog;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest{


    @Test
    public void beanTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        assertNotNull(context.getBean("A"));
        assertNotNull(context.getBean("B"));
        ExampleA a=(ExampleA)context.getBean("A");
        assertTrue(context.isPrototype("B"));
        assertNotNull(a.getName());
    }
}
