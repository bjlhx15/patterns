package com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg01outtercontroller;

/**
 * @author lihongxu6
 * @version 1.0
 * @className TimesFilter
 * @description TODO
 * @date 2020-12-04 16:44
 */

public class TimesFilter implements Filter {
    @Override
    public boolean filter(Task task) {
        System.out.println("次数限制检验");
        return true;
    }
}
