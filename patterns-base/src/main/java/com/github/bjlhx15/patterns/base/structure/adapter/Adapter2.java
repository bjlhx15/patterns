package com.github.bjlhx15.patterns.base.structure.adapter;

class Adaptee2{
    void adapteeRequest2(){
        System.out.println("com.github.bjlhx15.patterns.base.structure.adapter.Adaptere2.adapteeRequest2");
    }
}

interface Target2{
    void request();
}

public class Adapter2 implements Target2 {
    private Adaptee2 adaptee2;

    public Adapter2(Adaptee2 adaptee2) {
        this.adaptee2 = adaptee2;
    }
    @Override
    public void request() {
        System.out.println("com.github.bjlhx15.patterns.base.structure.adapter.Adapter2.request");
        adaptee2.adapteeRequest2();
    }
}
