package com.github.bjlhx15.patterns.base.eg03action.eg02templatemethod;

// 组装车（AbstractClass）
public abstract class MakeCar {
    //定义结构里哪些方法是所有过程都是一样的可复用的，哪些是需要子类进行实现的
    //组装车头
    public abstract void makeCarHead();

    //组装车身
    public abstract void makeCarBody();

    //组装车尾
    public abstract void makeCarTail();

    //喷漆 都一样 统一实现
    public void makeCarPaint() {
        System.out.println("汽车喷漆");
    }

    //打蜡
    public abstract void makeCarDaLa();

    //声明一个钩子方法 需要打蜡 由用户确认 是否需要
    protected boolean needMakeCarDaLa() {
        return true;
    }

    //汽车组装流程（template()） 用来控制流程
    //申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
    public final void makeCar() {
        this.makeCarHead();
        this.makeCarBody();
        this.makeCarTail();
        this.makeCarPaint();
        // 这里是否需要 交由钩子方法来决定
        if (needMakeCarDaLa()) {
            this.makeCarDaLa();
        }
    }
}
