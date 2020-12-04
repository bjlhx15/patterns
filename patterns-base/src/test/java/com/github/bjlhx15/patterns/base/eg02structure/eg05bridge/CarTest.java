package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge;

import com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.process01.Car;
import com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.process01.OilBus;
import org.junit.Test;

public class CarTest {
    @Test
    public void test() {
        Car car = new OilBus();
        car.installEngine();
    }

}