package com.github.bjlhx15.patterns.base.structure.facade;

import org.junit.Test;
import org.springframework.jdbc.support.JdbcUtils;

import static org.junit.Assert.*;

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