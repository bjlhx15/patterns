package com.github.bjlhx15.patterns.base.eg01create.eg03singleton;

import java.io.ObjectStreamException;

public class Singleton006 {

    /* 私有构造方法，防止被实例化 */
    private Singleton006() {
        System.out.println("new Singleton006");
    }

    /* 静态工程方法，创建实例 */
    public static Singleton006 getInstance() {
        return SingletonFactory.instance;
    }

    //内部类
    private static class SingletonFactory {
        private final static Singleton006 instance = new Singleton006();
    }


    //该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return SingletonFactory.instance;
    }
}