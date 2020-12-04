package com.github.bjlhx15.patterns.base.eg02structure.eg05bridge.impl;

/*
 * 电动发动机
 */
public class ElectricityEngine implements Engine{
    @Override
    public void installEngine() {
        System.out.println("安装电动发动机");
    }
}
