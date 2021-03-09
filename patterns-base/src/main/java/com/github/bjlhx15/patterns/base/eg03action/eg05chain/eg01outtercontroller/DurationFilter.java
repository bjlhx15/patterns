package com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg01outtercontroller;

/**
 * @author lihongxu
 * @version 1.0
 * @className DurationFilter
 * @description TODO
 * @date 2020-12-04 16:44
 */

public class DurationFilter implements Filter {
    @Override
    public boolean filter(Task task) {
        System.out.println("时效性检验");
        return true;
    }
}

