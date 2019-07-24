package com.github.bjlhx15.patterns.base.create.singleton;

public class Singleton013thread {

    private static final ThreadLocal<Singleton013thread> treadLocalInstance =
            new ThreadLocal<Singleton013thread>() {
                @Override
                protected Singleton013thread initialValue() {
                    return new Singleton013thread();
                }
            };

    private Singleton013thread() {
        System.out.println("ctor Singleton013thread");
    }

    public static Singleton013thread getInstance() {
        return treadLocalInstance.get();
    }
}
