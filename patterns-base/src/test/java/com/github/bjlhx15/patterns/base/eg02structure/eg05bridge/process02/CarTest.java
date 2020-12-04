package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.process02;

import org.junit.Test;

public class CarTest {
    @Test
    public void test(){
        Car bus = new Bus();
        Car suv = new Suv();

        bus.installOilEngine();
        bus.installElectricityEngine();

        suv.installOilEngine();
        suv.installElectricityEngine();
    }

}