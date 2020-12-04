package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.impl;

/*
 * SUV
 */
public class Suv extends Car{
    public Suv(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("SUV：");
        this.getEngine().installEngine();
    }
}
