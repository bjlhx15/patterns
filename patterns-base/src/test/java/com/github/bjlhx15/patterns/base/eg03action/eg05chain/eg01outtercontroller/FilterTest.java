package com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg01outtercontroller;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lihongxu6
 * @version 1.0
 * @className FilterTest
 * @description TODO
 * @date 2020-12-04 16:46
 */
public class FilterTest {
    private List<Filter> filters;

    @Before
    public void setUp() throws Exception {
        filters=new ArrayList<>();
        filters.add(new DurationFilter());
        filters.add(new RiskFilter());
        filters.add(new TimesFilter());
    }

    @Test
    public void filter() {
        Task task = new Task(); // 这里task一般是通过数据库查询得到的
        for (Filter filter : filters) {
            if (!filter.filter(task)) {
                return;
            }
        }
        // 过滤完成，后续是执行任务的逻辑
    }
}