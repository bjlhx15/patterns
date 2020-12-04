package com.github.bjlhx15.patterns.base.eg03action.eg08state;

import org.junit.Test;

public class StateTest {
    @Test
    public void test() {
        Context context = new Context();

        LogInState startState = new LogInState();
        startState.doAction(context);


        LogOutState stopState = new LogOutState();
        stopState.doAction(context);

    }
}