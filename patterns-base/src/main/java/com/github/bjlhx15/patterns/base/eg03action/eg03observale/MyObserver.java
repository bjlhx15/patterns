package com.github.bjlhx15.patterns.base.eg03action.eg03observale;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("对象已改变");
    }
}
