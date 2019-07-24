package com.github.bjlhx15.patterns.base.structure.adapter;

import com.github.bjlhx15.patterns.base.create.singleton.EagerSingleton;
import org.junit.Test;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

public class AdapterTest {

    @Test
    public void request() {
        Target target = new Adapter();
        target.request();
    }


}