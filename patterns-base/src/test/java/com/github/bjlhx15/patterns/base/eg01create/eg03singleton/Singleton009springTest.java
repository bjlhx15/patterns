package com.github.bjlhx15.patterns.base.eg01create.eg03singleton;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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