package com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.objectadapter;

import com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.objectadapter.Adaptee2;
import com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.objectadapter.Adapter2;
import com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.objectadapter.Target2;
import org.junit.Test;

public class Adapter2Test {

    @Test
    public void request() {
        Target2 target2 = new Adapter2(new Adaptee2());
        target2.request();
    }
//    Controller
}
