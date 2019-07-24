package com.github.bjlhx15.patterns.base.create.abstractfactory;

public class SouthFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
