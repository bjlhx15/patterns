package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.impl;

/*
 * 公交车
 */
public class Bus extends Car{

    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("公交：");
        this.getEngine().installEngine();
    }
}
