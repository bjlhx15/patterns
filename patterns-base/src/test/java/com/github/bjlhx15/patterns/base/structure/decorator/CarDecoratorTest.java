package com.github.bjlhx15.patterns.base.structure.decorator;

import com.github.bjlhx15.patterns.base.structure.decorator.old.Car;
import com.github.bjlhx15.patterns.base.structure.decorator.old.RunCar;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarDecoratorTest {

    @Test
    public void getCar() {
        Car car = new RunCar();
        Car swimCar = new SwimCarDecorator(car);
        swimCar.show();
    }
    @Test
    public void getCar2() {
        Car car = new RunCar();
        Car swimCar = new SwimCarDecorator(car);
        Car flySwimCar = new FlyCarDecorator(swimCar);
        flySwimCar.show();
    }
}