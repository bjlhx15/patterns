package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.process01;

public class OilBus extends Bus{
    @Override
    public void installEngine() {
        System.out.println("给公交安装燃油发动机");
    }
}
