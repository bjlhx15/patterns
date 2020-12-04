package com.github.bjlhx15.patterns.base.eg03action.eg07memento;

/*
 * Originator（原生者）
 */
public class Person {
    /*
     * 姓名，年龄，性别就是结构图中的state，状态属性
     */
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;

    public Person() {
        super();
    }

    public Person(String name, int age, String sex) {
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

    public void display() {
        System.out.println("name:" + name + ",sex:" + sex + ",age:" + age);
    }

    //创建一个备份
    public Memento createMemento() {
        return new Memento(name, age, sex);
    }

    //恢复一个备份
    public void setMemento(Memento memento) {
        this.name = memento.getName();
        this.age = memento.getAge();
        this.sex = memento.getSex();
    }
}
