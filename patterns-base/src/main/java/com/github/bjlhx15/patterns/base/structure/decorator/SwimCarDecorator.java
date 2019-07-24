package com.github.bjlhx15.patterns.base.structure.decorator;

import com.github.bjlhx15.patterns.base.structure.decorator.old.Car;

public class SwimCarDecorator extends CarDecorator {

    public SwimCarDecorator(Car car){
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    public void swim(){
        System.out.println("可以游泳");
    }

    @Override
    public void run() {
    }
}
