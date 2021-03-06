package com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.dynamicproxy;

import com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.IOrderService;
import com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.Order;
import com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.OrderServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:applicationContext-eg03proxy-static.xml"}) //加载配置文件
public class OrderServiceDynamicProxyTest {
    @Test
    public void test() {
        Order order = new Order();
        order.setUserId(2);
        /** 这里没有采用spring自动注入的方式，而是采用了直接new的方式 */
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}