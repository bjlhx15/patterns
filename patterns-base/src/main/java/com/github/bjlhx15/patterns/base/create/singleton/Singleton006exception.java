package com.github.bjlhx15.patterns.base.create.singleton;

public class Singleton006exception {

    /* 私有构造方法，防止被实例化 */
    private Singleton006exception() {
        System.out.println("new Singleton006exception");
        throw new RuntimeException("init exception");
    }

    /* 静态工程方法，创建实例 */
    public static Singleton006exception getInstance() {
        return SingletonFactory.instance;
    }

    //内部类
    private static class SingletonFactory {
        private static Singleton006exception instance = new Singleton006exception();
    }
}