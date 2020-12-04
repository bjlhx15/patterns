package com.github.bjlhx15.patterns.base.eg02structure.eg02decorator.old;

public class SwimCar implements Car {

    @Override
    public void show() {
        this.run();
        this.swim();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }

    public void swim() {
        System.out.println("可以游泳");
    }
}
