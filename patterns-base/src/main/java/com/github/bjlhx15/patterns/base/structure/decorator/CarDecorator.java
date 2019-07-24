package com.github.bjlhx15.patterns.base.structure.decorator;

import com.github.bjlhx15.patterns.base.structure.decorator.old.Car;

public abstract class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public abstract void show();
}
