package com.github.bjlhx15.patterns.base.eg01create.eg03singleton;

public class Singleton007 {

    private static Singleton007 instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton007() {
        System.out.println("new Singleton007");
    }

    static {
        instance = new Singleton007();
    }

        /* 静态工程方法，创建实例 */
    public static Singleton007 getInstance() {
            return instance;
    }
}