package com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.staticproxy;

import com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:applicationContext-eg03proxy-static.xml"}) //加载配置文件
public class OrderServiceStaticProxyTest {

    @Test
    public void saveOrder() {
        Order order = new Order();
        order.setUserId(0);
        /** 这里没有采用spring自动注入的方式，而是采用了直接new的方式 */
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
//        MapperProxy
    }
}