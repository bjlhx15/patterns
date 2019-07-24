package com.github.bjlhx15.patterns.base.create.singleton;

import java.util.HashMap;

public class Singleton010Reg {
    static private HashMap registry = new HashMap();

    //静态块，在类被加载时自动执行
    static {
        Singleton010Reg rs = new Singleton010Reg();
        registry.put(rs.getClass().getName(), rs);
    }

    //受保护的默认构造函数，如果为继承关系，则可以调用，克服了单例类不能为继承的缺点
    protected Singleton010Reg() {
        System.out.println("cotr Singleton010Reg");
    }

    //静态工厂方法，返回此类的唯一实例
    public static Singleton010Reg getInstance(String name) {
        if (name == null||name=="") {
            name = "com.github.bjlhx15.patterns.base.create.singleton.Singleton010Reg";
        }
        if (registry.get(name) == null) {
            try {
                registry.put(name, Class.forName(name).newInstance());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return (Singleton010Reg) registry.get(name);
    }
}

