package com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.classadapter01;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void request() {
        Target target = new Adapter();
        target.request();
    }


}