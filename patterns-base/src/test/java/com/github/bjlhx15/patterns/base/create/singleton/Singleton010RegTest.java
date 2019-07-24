package com.github.bjlhx15.patterns.base.create.singleton;

import com.sun.istack.internal.Nullable;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.TypeMismatchException;


import java.security.AccessControlContext;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

public class Singleton010RegTest {
    @Test
    public void getInstance() {
        long start = System.currentTimeMillis();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(50);
//        Set<Integer> setObj = new HashSet<>(); //线程并发问题
        ConcurrentSkipListSet<Integer> setObj = new ConcurrentSkipListSet();
        for (int i = 0; i < 500; i++) {
            fixedThreadPool.submit(() -> {
                Singleton010Reg instance = Singleton010Reg.getInstance("");
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
//    AbstractBeanFactory




}