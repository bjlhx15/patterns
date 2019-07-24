package com.github.bjlhx15.patterns.base.create.singleton;

public class Singleton008 {

    private enum MyEnumSingleton{
        singletonFactory;

        private Singleton008 instance;

        private MyEnumSingleton(){//枚举类的构造方法在类加载是被实例化
            instance = new Singleton008();
        }

        public Singleton008 getInstance(){
            return instance;
        }
    }


    /* 私有构造方法，防止被实例化 */
    private Singleton008() {
        System.out.println("new Singleton008");
    }

    public static Singleton008 getInstance(){
        return MyEnumSingleton.singletonFactory.getInstance();
    }
}
