package com.github.bjlhx15.patterns.base.eg02structure.eg01adapter.classadapter01;

class Adaptee{
    void adapteeRequest(){
        System.out.println("处理一些工作");
    }
}
interface Target{
    void request();
}

public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        this.adapteeRequest();
        System.out.println("基于上述任务，又处理另外一些工作");
    }
}
