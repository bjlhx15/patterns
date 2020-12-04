package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.process01;

public class OilSuv extends Suv{
    @Override
    public void installEngine() {
        System.out.println("给SUV安装燃油发动机");
    }
}
