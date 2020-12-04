package com.github.bjlhx15.patterns.base.eg03action.eg07memento;

/*
 * Memento（备忘录）
 */
public class Memento {
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;

    public Memento() {
        super();
    }

    public Memento(String name, int age, String sex) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
