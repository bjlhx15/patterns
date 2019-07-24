package com.github.bjlhx15.patterns.base.create.singleton;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;


public class Singleton011springattrTest {
    @Test
    public void test_singleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-011.xml");
        Singleton011springattr hi1 = (Singleton011springattr) context.getBean("singleton011springattr");
        hi1.setName("李宏旭1");
//        Singleton011springattr hi2 = (Singleton011springattr) context.getBean("singleton011springattr");
//        hi2.setName("李宏旭2");
        System.out.println(hi1);
        System.out.println(hi1.getName());
//        System.out.println(hi2);
//        System.out.println(hi2.getName());
    }

    @Test
    public void getInstance() throws InterruptedException {
        long start = System.currentTimeMillis();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-011.xml");
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(50);
//        Set<Integer> setObj = new HashSet<>(); //线程并发问题
        ConcurrentSkipListSet<Integer> setObj = new ConcurrentSkipListSet();

        CopyOnWriteArrayList<Singleton011springattr> list = new CopyOnWriteArrayList();
        for (int i = 0; i < 50; i++) {
            fixedThreadPool.submit(() -> {
                Singleton011springattr instance = (Singleton011springattr) context.getBean("singleton011springattr");
                instance.setName("name:"+Math.random());
//                list.add(instance);
                try {
                    soutThreadService(instance);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setObj.add(instance.hashCode());
            });
        }
        fixedThreadPool.shutdown();
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("生成类数：" + setObj.size());
        for (Integer s : setObj) {
            System.out.println("hashcode:" + s);
        }

        Thread.sleep(3000);
    }

    public void soutThreadService(Singleton011springattr singleton011springattr) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(singleton011springattr.getName());
    }

}