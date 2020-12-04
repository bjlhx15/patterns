package com.github.bjlhx15.patterns.base.eg01create.eg03singleton;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton014Atomic {

    private static AtomicReference<Singleton014Atomic> singleton = new AtomicReference<Singleton014Atomic>();

    private Singleton014Atomic() {
    }

    public static Singleton014Atomic getInstance() {
        for (; ; ) {
            Singleton014Atomic instance = singleton.get();
            if (instance != null) {
                return instance;
            }
            instance = new Singleton014Atomic();
            if (singleton.compareAndSet(null, instance)) {
                return instance;
            }
        }
    }
}
