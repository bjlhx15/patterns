package com.github.bjlhx15.patterns.base.create.abstractfactory;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Statement;

import static org.junit.Assert.*;

public class FruitFactoryTest {

    @Test
    public void testFactory(){
        FruitFactory nf = new NorthFactory();

        Fruit nApple = nf.getApple();
        nApple.get();

        Fruit nBanana = nf.getBanana();
        nBanana.get();

        FruitFactory sf = new SouthFactory();

        Fruit sApple = sf.getApple();
        sApple.get();

        Fruit sBanana = sf.getBanana();
        sBanana.get();
    }
}