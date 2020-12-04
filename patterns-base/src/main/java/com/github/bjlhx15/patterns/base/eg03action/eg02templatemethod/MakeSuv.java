package com.github.bjlhx15.patterns.base.eg03action.eg02templatemethod;


//  组装SUV
public class MakeSuv extends MakeCar{

    @Override
    public void makeCarHead() {
        System.out.println("组装SUV车头");
    }

    @Override
    public void makeCarBody() {
        System.out.println("组装SUV车身");
    }

    @Override
    public void makeCarTail() {
        System.out.println("组装SUV车尾");
    }

    @Override
    public void makeCarDaLa() {
        System.out.println("组装SUV-打蜡");
    }
}
