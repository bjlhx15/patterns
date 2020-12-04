package com.github.bjlhx15.patterns.base.eg03action.eg07memento;

/*
 * Caretaker（管理者）
 */
public class Caretaker {
    //持有一个对Memento的引用
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
