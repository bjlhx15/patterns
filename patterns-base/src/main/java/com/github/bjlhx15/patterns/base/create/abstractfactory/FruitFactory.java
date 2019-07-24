package com.github.bjlhx15.patterns.base.create.abstractfactory;

public interface FruitFactory {
    //实例化一个苹果
    Fruit getApple();

    //实例化一个香蕉
    Fruit getBanana();
}
