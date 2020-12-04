package com.github.bjlhx15.patterns.base.eg02structure.eg02decorator;

import com.github.bjlhx15.patterns.base.eg02structure.eg02decorator.old.Car;
import com.github.bjlhx15.patterns.base.eg02structure.eg02decorator.old.SwimCar;
import org.junit.Test;

public class CarTest {
    @Test
    public void testCar() {
        //        Car car = new RunCar();
//        Car car = new FlyCar();
        Car car = new SwimCar();
        car.show();
    }
}