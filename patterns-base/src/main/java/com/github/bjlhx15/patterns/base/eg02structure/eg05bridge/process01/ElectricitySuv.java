package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.process01;

public class ElectricitySuv extends Suv{
    @Override
    public void installEngine() {
        System.out.println("给SUV安装电动发动机");
    }
}
