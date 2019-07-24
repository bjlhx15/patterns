package com.github.bjlhx15.patterns.base.create.singleton;

import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanCreationNotAllowedException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Singleton009springTest {
    @Test
    public void test_singleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Singleton009spring hi1 = (Singleton009spring) context.getBean("singleton009spring");
        Singleton009spring hi2 = (Singleton009spring) context.getBean("singleton009spring");
        System.out.println(hi1);
        System.out.println(hi2);
    }

    @Test
    public void test_prototype() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Singleton009spring hi1 = (Singleton009spring) context.getBean("singleton009spring2");
        Singleton009spring hi2 = (Singleton009spring) context.getBean("singleton009spring2");
        System.out.println(hi1);
        System.out.println(hi2);
    }



}