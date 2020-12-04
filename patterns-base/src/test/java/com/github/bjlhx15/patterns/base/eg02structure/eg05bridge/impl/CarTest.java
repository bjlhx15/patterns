package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.impl;

import org.junit.Test;

public class CarTest {

    @Test
    public void getEngine() {
        Engine oilEngine = new OilEngine();
        Engine electricityEngine = new ElectricityEngine();

        Car oilBus = new Bus(oilEngine);
        Car electricityBus = new Bus(electricityEngine);

        Car oilSuv = new Suv(oilEngine);
        Car electricitySuv = new Suv(electricityEngine);

        oilBus.installEngine();
        electricityBus.installEngine();

        oilSuv.installEngine();
        electricitySuv.installEngine();
    }
}