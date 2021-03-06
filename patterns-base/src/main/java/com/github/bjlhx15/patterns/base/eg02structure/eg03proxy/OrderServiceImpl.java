package com.github.bjlhx15.patterns.base.eg02structure.eg03proxy;

public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        /** Spring会自己注入，我们这里就直接new出来了 */
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service调用Dao层添加Order层");
        return iOrderDao.insert(order);
    }
}
