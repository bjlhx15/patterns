package com.github.bjlhx15.patterns.base.create.factorymethod;

import com.github.bjlhx15.patterns.base.create.samplefactory.Fruit;

public class Pear implements Fruit {  //具体产品
    @Override
    public void get() {
        System.out.println("采集梨子");
    }
}
