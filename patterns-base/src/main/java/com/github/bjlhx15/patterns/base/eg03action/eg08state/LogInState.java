package com.github.bjlhx15.patterns.base.eg03action.eg08state;

public class LogInState implements State {
    @Override
    public void doAction (Context context){
        System.out.println("登陆成功");
    }
}
