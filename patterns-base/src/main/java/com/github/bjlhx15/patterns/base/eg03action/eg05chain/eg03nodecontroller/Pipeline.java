package com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg03nodecontroller;

/**
 * @author lihongxu6
 * @version 1.0
 * @className Pipeline
 * @description TODO
 * @date 2020-12-11 14:05
 */
public interface Pipeline {

    Pipeline fireTaskReceived();

    Pipeline fireTaskFiltered();

    Pipeline fireTaskExecuted();

    Pipeline fireAfterCompletion();
}
