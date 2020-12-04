package com.github.bjlhx15.patterns.base.eg03action.eg01strategy;

public class MD5Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("执行MD5摘要");
    }
}
