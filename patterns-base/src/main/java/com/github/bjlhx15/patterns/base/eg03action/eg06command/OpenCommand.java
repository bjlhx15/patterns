package com.github.bjlhx15.patterns.base.eg03action.eg06command;

/**
 * 具体命令类
 */
public class OpenCommand implements Command {
    private Receiver receiver;

    public OpenCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.open();
    }
}