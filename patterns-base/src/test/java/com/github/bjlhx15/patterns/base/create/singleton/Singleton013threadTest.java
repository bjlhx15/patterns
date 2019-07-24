package com.github.bjlhx15.patterns.base.create.singleton;

import org.junit.Test;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

public class Singleton013threadTest {
    @Test
    public void getInstance() throws Exception {
        long start = System.currentTimeMillis();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
//        Set<Integer> setObj = new HashSet<>(); //线程并发问题
        ConcurrentSkipListSet<Integer> setObj = new ConcurrentSkipListSet();
        for (int i = 0; i < 5; i++) {
            fixedThreadPool.submit(() -> {
                Singleton013thread instance = Singleton013thread.getInstance();
                Singleton013thread instance2 = Singleton013thread.getInstance();
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