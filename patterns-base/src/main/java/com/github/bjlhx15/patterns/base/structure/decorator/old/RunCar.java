package com.github.bjlhx15.patterns.base.structure.decorator.old;

public class RunCar implements Car {

    @Override
    public void show() {
        this.run();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }
}