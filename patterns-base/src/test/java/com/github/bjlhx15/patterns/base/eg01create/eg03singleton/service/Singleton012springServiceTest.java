package com.github.bjlhx15.patterns.base.eg01create.eg03singleton.service;

import com.github.bjlhx15.patterns.base.eg01create.eg03singleton.Singleton011springattr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:applicationContext-012.xml"}) //加载配置文件
public class Singleton012springServiceTest {
    @Autowired
    Singleton012springService a;

    @Test
    public void testA() {
        System.out.println(a);
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