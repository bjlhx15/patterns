package com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg01outtercontroller;

/**
 * @author lihongxu6
 * @version 1.0
 * @className RiskFilter
 * @description TODO
 * @date 2020-12-04 16:44
 */
public class RiskFilter implements Filter {
    @Override
    public boolean filter(Task task) {
        System.out.println("风控拦截");
        return true;
    }
}

