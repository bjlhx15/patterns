package com.github.bjlhx15.patterns.base.structure.facade;

public class Facade {
    private StartPower startPower = null;
    private BoisSelfTest boisSelfTest = null;
    private SystemGuide systemGuide = null;
    private EnterSystem enterSystem = null;

    public void startComputer(){
        startPower = new StartPower();
        boisSelfTest = new BoisSelfTest();
        systemGuide = new SystemGuide();
        enterSystem = new EnterSystem();

        startPower.startPower();
        boisSelfTest.boisSelfTest();
        systemGuide.systemGuide();
        enterSystem.enterSystem();
    }
}
