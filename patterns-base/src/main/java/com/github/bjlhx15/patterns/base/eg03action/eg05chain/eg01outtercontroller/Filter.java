package com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg01outtercontroller;

/**
 * @author lihongxu
 * @version 1.0
 * @className Filter
 * @description TODO
 * @date 2020-12-04 16:42
 */
public interface Filter {
    /**
     * 用于对各个任务节点进行过滤
     */
    boolean filter(Task task);
}
