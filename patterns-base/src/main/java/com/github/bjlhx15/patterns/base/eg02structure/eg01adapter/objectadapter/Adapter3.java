package com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.objectadapter;

import com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.objectadapter.Adaptee2;
import com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.objectadapter.Target2;

class Adaptee3{
    void adapteeRequest3(){
        System.out.println("com.github.bjlhx15.patterns.base.eg02structure.chhapter01adapter.Adaptere2.adapteeRequest2");
    }
}

interface Target3{
    void request();
}

public abstract class Adapter3 implements Target2 {
    private Adaptee2 adaptee2;

    public Adapter3(Adaptee2 adaptee2) {
        this.adaptee2 = adaptee2;
    }

    @Override
    public void request() {
        System.out.println("Adapter2.request");
        adaptee2.adapteeRequest2();
    }
}
