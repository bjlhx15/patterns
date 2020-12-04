package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.impl;

/*
 * 汽车
 */
public abstract class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    //安装发动机
    public abstract void installEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
