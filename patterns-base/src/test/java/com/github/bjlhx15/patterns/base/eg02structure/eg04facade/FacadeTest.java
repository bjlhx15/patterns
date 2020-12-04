package com.github.bjlhx15.patterns.base.eg02structure.eg04facade;

import org.junit.Test;

public class FacadeTest {
    @Test
    public void testOrigin() {
        StartPower startPower = new StartPower();
        startPower.startPower();

        BoisSelfTest boisSelfTest = new BoisSelfTest();
        boisSelfTest.boisSelfTest();

        SystemGuide systemGuide = new SystemGuide();
        systemGuide.systemGuide();

        EnterSystem enterSystem = new EnterSystem();
        enterSystem.enterSystem();
    }

    @Test
    public void testFacadeClient() {
        Facade computer = new Facade();
        computer.startComputer();
//        Configuration
    }


}