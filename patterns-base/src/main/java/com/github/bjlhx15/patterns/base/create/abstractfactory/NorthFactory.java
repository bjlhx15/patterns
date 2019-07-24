package com.github.bjlhx15.patterns.base.create.abstractfactory;

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