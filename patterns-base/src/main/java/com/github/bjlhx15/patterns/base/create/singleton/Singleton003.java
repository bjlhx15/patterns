package com.github.bjlhx15.patterns.base.create.singleton;

import java.util.concurrent.TimeUnit;

public class Singleton003 {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton003 instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton003() {
        System.out.println("new Singleton003");
    }

    /* 静态工程方法，创建实例 */
    public static Singleton003 getInstance() {
        if (instance == null) {
            synchronized (Singleton003.class) {
                instance = new Singleton003();
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}