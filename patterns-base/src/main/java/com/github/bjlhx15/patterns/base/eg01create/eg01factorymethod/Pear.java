package com.github.bjlhx15.patterns.base.eg01create.eg01factorymethod;

import com.github.bjlhx15.patterns.base.eg01create.eg00samplefactory.Fruit;

public class Pear implements Fruit {  //具体产品
    @Override
    public void get() {
        System.out.println("采集梨子");
    }
}
