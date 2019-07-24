package com.github.bjlhx15.patterns.base.create.factorymethod;

import com.github.bjlhx15.patterns.base.create.samplefactory.Banana;
import com.github.bjlhx15.patterns.base.create.samplefactory.Fruit;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}