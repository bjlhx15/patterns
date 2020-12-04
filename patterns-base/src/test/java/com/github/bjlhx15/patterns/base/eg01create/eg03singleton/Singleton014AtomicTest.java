package com.github.bjlhx15.patterns.base.eg01create.eg03singleton;

import org.junit.Test;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

public class Singleton014AtomicTest {

    @Test
    public void getInstance() throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(50);
//        Set<Integer> setObj = new HashSet<>(); //线程并发问题
        ConcurrentSkipListSet<Integer> setObj = new ConcurrentSkipListSet();
        for (int i = 0; i < 50; i++) {
            fixedThreadPool.submit(() -> {
                Singleton014Atomic instance = Singleton014Atomic.getInstance();
                Singleton014Atomic instance2 = Singleton014Atomic.getInstance();
                setObj.add(instance.hashCode());
                setObj.add(instance2.hashCode());
            });
        }
        fixedThreadPool.shutdown();
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("生成类数：" + setObj.size());
        Thread.sleep(1000);
        for (Integer s : setObj) {
            System.out.println("hashcode:" + s);
        }
    }
}