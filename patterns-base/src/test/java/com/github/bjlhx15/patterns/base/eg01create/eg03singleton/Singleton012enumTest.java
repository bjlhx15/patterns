package com.github.bjlhx15.patterns.base.eg01create.eg03singleton;

import org.junit.Test;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton012enumTest {

    @Test
    public void test_singleton() {
        Singleton012enum.INSTANCE.whateverMethod();
//        AbstractFactoryBean
    }

    @Test
    public void getInstance() {
        long start = System.currentTimeMillis();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(50);
//        Set<Integer> setObj = new HashSet<>(); //线程并发问题
        ConcurrentSkipListSet<Integer> setObj = new ConcurrentSkipListSet();
        for (int i = 0; i < 500; i++) {
            fixedThreadPool.submit(() -> {
                Singleton012enum instance = Singleton012enum.getInstance();
                setObj.add(instance.hashCode());
            });
        }
        fixedThreadPool.shutdown();
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("生成类数：" + setObj.size());
        for (Integer s : setObj) {
            System.out.println("hashcode:" + s);
        }
    }

}