package com.github.bjlhx15.patterns.base.eg03action.eg10mediator;

import org.junit.Test;

public class ChatRoomTest {

    @Test
    public void showMessage() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}