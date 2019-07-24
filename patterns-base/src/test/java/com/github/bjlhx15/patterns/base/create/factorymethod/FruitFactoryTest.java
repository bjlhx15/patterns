package com.github.bjlhx15.patterns.base.create.factorymethod;

import com.github.bjlhx15.patterns.base.create.samplefactory.Fruit;
import org.junit.Test;

import static org.junit.Assert.*;

public class FruitFactoryTest {
    @Test
    public void base001() throws Exception {
        //实例化Apple，用到了工厂类
        Fruit apple = FruitFactory001.getFruit("Apple");
        //实例化Banana，用到了工厂类
        Fruit banana = FruitFactory001.getFruit("Banana");
        //实例化Pear，用到了工厂类
        Fruit pear = FruitFactory001.getFruit("Pear");

        apple.get();
        banana.get();
        pear.get();
    }

    @Test
    public void base002() throws Exception {
        //获得AppleFactory
        FruitFactory af = new AppleFactory();
        //通过AppleFactory来获得Apple实例对象
        Fruit apple = af.getFruit();
        apple.get();

        //获得BananaFactory
        FruitFactory bf = new BananaFactory();
        //通过BananaFactory来获得Apple实例对象
        Fruit banana = bf.getFruit();
        banana.get();
    }
}