package com.github.bjlhx15.patterns.base.eg03action.eg07memento;

import org.junit.Test;

public class MementoTest {

    @Test
    public void test() {
        Person person = new Person("小明",18,"男");
        //打印
        person.display();

        //创建一个管理者
        Caretaker caretaker = new Caretaker();

        //创建一个备份
//        Memento memento = person.createMemento();
        caretaker.setMemento(person.createMemento());

        person.setName("小红");
        person.setAge(17);
        person.setSex("女");
        //打印
        person.display();

        //备份还原
        person.setMemento(caretaker.getMemento());
        //打印
        person.display();
    }
}