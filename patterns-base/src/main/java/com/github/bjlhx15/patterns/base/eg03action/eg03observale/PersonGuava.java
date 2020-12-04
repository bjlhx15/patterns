package com.github.bjlhx15.patterns.base.eg03action.eg03observale;

import com.google.common.eventbus.EventBus;

public class PersonGuava {
    EventBus eventBus = new EventBus();
    private String name;
    private String sex;
    private int age;

    public PersonGuava() {
        //注册Listener
        eventBus.register(new PersonGuavaListener());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //向订阅者发送消息
        eventBus.post("Simple Event:name:"+name);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        //向订阅者发送消息
        eventBus.post("Simple Event:sex:"+sex);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        //向订阅者发送消息
        eventBus.post("Simple Event:age:"+age);
    }
}
