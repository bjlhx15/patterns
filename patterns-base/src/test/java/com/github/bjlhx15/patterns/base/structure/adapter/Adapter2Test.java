package com.github.bjlhx15.patterns.base.structure.adapter;

import org.junit.Test;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.Controller;

import static org.junit.Assert.*;

public class Adapter2Test {

    @Test
    public void request() {
        Target2 target2 = new Adapter2(new Adaptee2());
        target2.request();
    }
//    Controller
}
