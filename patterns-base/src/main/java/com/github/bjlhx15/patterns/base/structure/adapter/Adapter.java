package com.github.bjlhx15.patterns.base.structure.adapter;

class Adaptee{
    void adapteeRequest(){
        System.out.println("com.github.bjlhx15.patterns.base.structure.adapter.Adaptee.adapteeRequest");
    }
}
interface Target{
    void request();
}

public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        System.out.println("com.github.bjlhx15.patterns.base.structure.adapter.Adapter.request");
        this.adapteeRequest();
    }
}
