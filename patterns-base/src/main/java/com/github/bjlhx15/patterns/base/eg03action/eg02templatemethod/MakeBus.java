package com.github.bjlhx15.patterns.base.eg03action.eg02templatemethod;

//组装公交车
public class MakeBus extends MakeCar{

    @Override
    public void makeCarHead() {
        System.out.println("组装公交车车头");
    }

    @Override
    public void makeCarBody() {
        System.out.println("组装公交车车身");
    }

    @Override
    public void makeCarTail() {
        System.out.println("组装公交车车尾");
    }

    @Override
    public void makeCarDaLa() {

    }

    @Override
    protected boolean needMakeCarDaLa() {
        return false;
    }
}
