package com.github.bjlhx15.patterns.base.eg03action.eg03observale;

import org.junit.Test;

public class MyObserverTest {

    @Test
    public void update() {
        Person person = new Person();
        //注册观察者
        person.addObserver(new MyObserver());
        person.setName("小明");
        person.setSex("男");
        person.setAge(18);
    }


    @Test
    public void update2() {
        Person person = new Person();
        //注册观察者
        MyObserver myObserver = new MyObserver();
        person.addObserver(myObserver);
        person.addObserver(new MyObserver());
        //获得当前对象已注册的观察者数目
        person.countObservers();
        //删除指定的一个观察者
        person.deleteObserver(myObserver);
        //删除该对象全部观察者
        person.deleteObservers();

        person.setName("小明");
        person.setSex("男");
        person.setAge(18);
    }
}