package com.github.bjlhx15.patterns.base.create.builder;

import org.junit.Test;

public class PersonTest {
    @Test
    public void testBuilder() {
        Person student = new Person.Builder().setName("aaa").setAge(11).build();
//        BeanDefinitionBuilder
    }
}