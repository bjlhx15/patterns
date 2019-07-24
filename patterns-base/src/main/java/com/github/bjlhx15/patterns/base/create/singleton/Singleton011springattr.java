package com.github.bjlhx15.patterns.base.create.singleton;


public class Singleton011springattr {
    public Singleton011springattr() {
        System.out.println("ctor singleton011springattr");
    }

    public void init() {
        System.out.println("init singleton011springattr");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
