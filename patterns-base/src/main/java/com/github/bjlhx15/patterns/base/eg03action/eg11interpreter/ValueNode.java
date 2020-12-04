package com.github.bjlhx15.patterns.base.eg03action.eg11interpreter;

public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
