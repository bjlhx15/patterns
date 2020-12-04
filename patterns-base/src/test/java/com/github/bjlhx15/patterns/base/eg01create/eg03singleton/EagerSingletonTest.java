package com.github.bjlhx15.patterns.base.eg01create.eg03singleton;

import org.junit.Test;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EagerSingletonTest {

    @Test
    public void getInstance() throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(500);
//        Set<Integer> setObj = new HashSet<>(); //线程并发问题
        ConcurrentSkipListSet<Integer> setObj = new ConcurrentSkipListSet();
        for (int i = 0; i < 10000; i++) {
            fixedThreadPool.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EagerSingleton instance = EagerSingleton.getInstance();
                setObj.add(instance.hashCode());
            });
//            System.out.println(System.currentTimeMillis());
        }
        Thread.sleep(200);
        fixedThreadPool.shutdown();
        System.out.println("耗时："+(System.currentTimeMillis()-start)+"ms");
        System.out.println("生成类数："+setObj.size());
        for (Integer s : setObj) {
            System.out.println("hashcode:"+s);
        }
    }
}