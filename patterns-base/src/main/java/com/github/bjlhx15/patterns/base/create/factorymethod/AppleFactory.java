package com.github.bjlhx15.patterns.base.create.factorymethod;

import com.github.bjlhx15.patterns.base.create.samplefactory.Apple;
import com.github.bjlhx15.patterns.base.create.samplefactory.Fruit;

public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}