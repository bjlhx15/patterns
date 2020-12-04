package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.process02;

/*
 * 公交车
 */
public class Bus implements Car{
    @Override
    public void installOilEngine() {
        System.out.println("给公交安装燃油发动机");
    }

    @Override
    public void installElectricityEngine() {
        System.out.println("给公交安装电动发动机");
    }
}
