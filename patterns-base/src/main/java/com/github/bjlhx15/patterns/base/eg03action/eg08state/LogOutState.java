package com.github.bjlhx15.patterns.base.eg03action.eg08state;

public class LogOutState implements State {
    @Override
    public void doAction (Context context){
        System.out.println("退出成功");
    }
}

