package com.github.bjlhx15.patterns.base.eg03action.eg03observale;

import com.google.common.eventbus.Subscribe;

public class PersonGuavaListener {
    @Subscribe
    public void doAction(final String event) {
        System.out.println("对象发生变化:" + event);
    }
}
