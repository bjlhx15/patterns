package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.impl;

/*
 * 燃油发动机
 */
public class OilEngine implements Engine{
    @Override
    public void installEngine() {
        System.out.println("安装燃油发动机");
    }
}
