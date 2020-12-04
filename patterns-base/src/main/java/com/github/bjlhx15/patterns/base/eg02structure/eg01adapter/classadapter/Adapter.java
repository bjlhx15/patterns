package com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.classadapter;

public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
