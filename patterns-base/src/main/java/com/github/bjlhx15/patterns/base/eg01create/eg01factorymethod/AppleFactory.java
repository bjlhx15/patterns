package com.github.bjlhx15.patterns.base.eg01create.eg01factorymethod;

import com.github.bjlhx15.patterns.base.eg01create.eg00samplefactory.Apple;
import com.github.bjlhx15.patterns.base.eg01create.eg00samplefactory.Fruit;

public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}