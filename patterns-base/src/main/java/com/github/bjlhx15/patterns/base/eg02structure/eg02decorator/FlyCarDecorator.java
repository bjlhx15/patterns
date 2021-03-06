package com.github.bjlhx15.patterns.base.eg02structure.eg02decorator;

import com.github.bjlhx15.patterns.base.eg02structure.eg02decorator.old.Car;

public class FlyCarDecorator extends CarDecorator {

    public FlyCarDecorator(Car car){
        super(car);
    }
    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    public void fly(){
        System.out.println("可以飞");
    }

    @Override
    public void run() {
    }
}
