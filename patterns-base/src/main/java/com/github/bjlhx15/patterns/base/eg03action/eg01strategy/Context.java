package com.github.bjlhx15.patterns.base.eg03action.eg01strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy stratrgy){
        this.strategy = stratrgy;
    }

    public void encrypt(){
        this.strategy.encrypt();
    }
}
