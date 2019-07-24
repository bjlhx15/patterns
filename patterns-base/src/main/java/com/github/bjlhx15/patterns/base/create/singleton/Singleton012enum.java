package com.github.bjlhx15.patterns.base.create.singleton;

public enum Singleton012enum {
    INSTANCE;

    Singleton012enum() {
        System.out.println("ctor Singleton012enum");
    }

    public static Singleton012enum getInstance(){
        return INSTANCE;
    }
    public void whateverMethod() {
        System.out.println("ss");
    }
}
