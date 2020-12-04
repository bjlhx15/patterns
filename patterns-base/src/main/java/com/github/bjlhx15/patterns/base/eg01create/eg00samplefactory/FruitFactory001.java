package com.github.bjlhx15.patterns.base.eg01create.eg00samplefactory;

public class FruitFactory001 {
    //获取Apple的实例，用static修饰，方便使用
    public static Fruit getApple() {
        return new Apple();
    }

    //获取Banana的实例，用static修饰，方便使用
    public static Fruit getBanana() {
        return new Banana();
    }
}
