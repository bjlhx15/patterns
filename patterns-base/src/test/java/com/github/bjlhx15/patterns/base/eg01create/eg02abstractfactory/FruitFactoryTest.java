package com.github.bjlhx15.patterns.base.eg01create.eg02abstractfactory;

import org.junit.Test;

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