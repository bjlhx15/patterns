package com.github.bjlhx15.patterns.base.eg03action.eg03observale;

import org.junit.Test;

public class PersonGuavaTest {

    @Test
    public void test() {
        PersonGuava person = new PersonGuava();
        person.setName("李宏旭");
        person.setAge(30);
        person.setSex("男");
    }
}