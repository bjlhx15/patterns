package com.github.bjlhx15.patterns.base.eg01create.eg00samplefactory;

public class FruitFactory003 {
    public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }
}
