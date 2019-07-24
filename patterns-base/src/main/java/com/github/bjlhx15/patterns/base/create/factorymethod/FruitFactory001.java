package com.github.bjlhx15.patterns.base.create.factorymethod;

import com.github.bjlhx15.patterns.base.create.samplefactory.Apple;
import com.github.bjlhx15.patterns.base.create.samplefactory.Banana;
import com.github.bjlhx15.patterns.base.create.samplefactory.Fruit;

public class FruitFactory001 { //工厂
    public static Fruit getFruit(String type) throws InstantiationException, IllegalAccessException{
        //不区分大小写
        if(type.equalsIgnoreCase("Apple")){
            return Apple.class.newInstance();
        }else if(type.equalsIgnoreCase("Banana")){
            return Banana.class.newInstance();
        }else if(type.equalsIgnoreCase("Pear")){
            return Pear.class.newInstance();
        }else{
            System.out.println("找不到相应的实体类");
            return null;
        }
    }
}
