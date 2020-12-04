package com.github.bjlhx15.patterns.base.eg01create.eg02abstractfactory;

public class NorthFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}