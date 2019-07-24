package com.github.bjlhx15.patterns.base.create.samplefactory;

public class FruitFactory002 {
    public static Fruit getFruit(String type) throws InstantiationException, IllegalAccessException {
        //不区分大小写
        if (type.equalsIgnoreCase("Apple")) {
            return Apple.class.newInstance();
        } else if (type.equalsIgnoreCase("Banana")) {
            return Banana.class.newInstance();
        } else {
            System.out.println("找不到相应的实体类");
            return null;
        }
    }
}
