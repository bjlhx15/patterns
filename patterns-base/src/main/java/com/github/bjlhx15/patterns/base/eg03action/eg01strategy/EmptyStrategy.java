package com.github.bjlhx15.patterns.base.eg03action.eg01strategy;

public class EmptyStrategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("没有加密策略");
    }
}
