package com.github.bjlhx15.patterns.base.eg02structure.eg02decorator.old;

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