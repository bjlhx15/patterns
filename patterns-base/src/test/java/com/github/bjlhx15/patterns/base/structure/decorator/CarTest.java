package com.github.bjlhx15.patterns.base.structure.decorator;

import com.github.bjlhx15.patterns.base.structure.decorator.old.Car;
import com.github.bjlhx15.patterns.base.structure.decorator.old.SwimCar;
import org.junit.Test;

import java.io.BufferedReader;

public class CarTest {
    @Test
    public void testCar() {
        //        Car car = new RunCar();
//        Car car = new FlyCar();
        Car car = new SwimCar();
        car.show();
    }
}