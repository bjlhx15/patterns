package com.github.bjlhx15.patterns.base.create.samplefactory;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class BananaTest {
    @Test
    public void base001() {
        //实例化Apple
        Apple apple = new Apple();
        //实例化Banana
        Banana banana = new Banana();

        apple.get();
        banana.get();
    }

    @Test
    public void base002() {
        //实例化Apple，用到了多态
        Fruit apple = new Apple();
        //实例化Banana，用到了多态
        Fruit banana = new Banana();

        apple.get();
        banana.get();
    }

    @Test
    public void base003() {
        //实例化Apple，用到了工厂类
        Fruit apple = FruitFactory001.getApple();
        //实例化Banana，用到了工厂类
        Fruit banana = FruitFactory001.getBanana();

        apple.get();
        banana.get();
    }

    @Test
    public void base004() throws Exception {
        //实例化Apple，用到了工厂类
        Fruit apple = FruitFactory002.getFruit("apple");
        //实例化Banana，用到了工厂类
        Fruit banana = FruitFactory002.getFruit("banana");

        apple.get();
        banana.get();
    }

    @Test
    public void base005() throws Exception {
        //实例化Apple，用到了工厂类
        Fruit apple = FruitFactory003.getFruit("com.github.bjlhx15.patterns.base.create.samplefactory.Apple");
        //实例化Banana，用到了工厂类
        Fruit banana = FruitFactory003.getFruit("com.github.bjlhx15.patterns.base.create.samplefactory.Banana");

        apple.get();
        banana.get();
    }

//    @Test
//    public void base006() throws Exception {
//        ILoggerFactroy
//    }
}