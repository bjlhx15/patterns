package com.github.bjlhx15.patterns.base.eg03action.eg02templatemethod;

import org.junit.Test;

public class MakeCarTest {

    @Test
    public void makeCar() {
        MakeCar makeBus = new MakeBus();
        makeBus.makeCar();

        System.out.println("===========================");

        MakeCar makeSuv = new MakeSuv();
        makeSuv.makeCar();
    }
}