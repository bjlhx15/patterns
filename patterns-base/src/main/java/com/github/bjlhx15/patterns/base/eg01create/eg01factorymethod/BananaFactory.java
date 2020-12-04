package com.github.bjlhx15.patterns.base.eg01create.eg01factorymethod;

import com.github.bjlhx15.patterns.base.eg01create.eg00samplefactory.Banana;
import com.github.bjlhx15.patterns.base.eg01create.eg00samplefactory.Fruit;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}