package com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.interfaceadapter;

import org.junit.Test;

public class SourceableTest {
    @Test
    public void test() {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}