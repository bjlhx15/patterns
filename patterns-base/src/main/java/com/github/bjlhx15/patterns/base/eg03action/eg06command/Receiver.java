package com.github.bjlhx15.patterns.base.eg03action.eg06command;

/**
 * 接收者：真正执行命令的对象
 */
public class Receiver {
    private String name;

    public Receiver(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "开放");
    }

    public void close() {
        System.out.println(this.name + "关闭");
    }
}