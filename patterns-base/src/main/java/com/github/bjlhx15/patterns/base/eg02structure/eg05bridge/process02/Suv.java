package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.process02;

/*
 * SUV
 */
public class Suv implements Car{
    @Override
    public void installOilEngine() {
        System.out.println("给SUV安装燃油发动机");
    }

    @Override
    public void installElectricityEngine() {
        System.out.println("给SUV安装电动发动机");
    }
}
