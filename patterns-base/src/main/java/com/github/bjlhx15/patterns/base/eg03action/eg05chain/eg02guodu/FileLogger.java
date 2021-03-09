package com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg02guodu;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
