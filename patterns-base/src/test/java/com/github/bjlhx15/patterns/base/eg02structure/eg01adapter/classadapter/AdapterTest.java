package com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.classadapter;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void method2() {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}