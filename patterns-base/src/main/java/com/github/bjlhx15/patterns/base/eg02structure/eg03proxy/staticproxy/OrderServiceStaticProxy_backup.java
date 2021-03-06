package com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.staticproxy;

import com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.IOrderService;
import com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.Order;
import com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.OrderServiceImpl;
import com.github.bjlhx15.patterns.base.eg02structure.eg03proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy_backup {
    /**  在代理类里面注入目标对象 */
    private IOrderService iOrderService;

    /** 我们要在这静态代理类里面增强这个方法 */
    public int saveOrder(Order order){
        beforeMethod();
        /** 如果这里有spring容器的话，就不用显示的new了 */
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        /** 这里就是实现一个分库的功能,对userId取模2，这里就只会得到0或者是1 */
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+dbRouter);

        afterMethod();
        return iOrderService.saveOrder(order);
    }

    /** 我们要增强，我们就来写上一个before和after */
    private void beforeMethod(){
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
