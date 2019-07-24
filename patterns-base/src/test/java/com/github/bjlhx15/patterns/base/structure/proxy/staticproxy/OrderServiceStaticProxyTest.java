package com.github.bjlhx15.patterns.base.structure.proxy.staticproxy;

import com.github.bjlhx15.patterns.base.structure.proxy.Order;
import org.apache.ibatis.binding.MapperProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:applicationContext-proxy-static.xml"}) //加载配置文件
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