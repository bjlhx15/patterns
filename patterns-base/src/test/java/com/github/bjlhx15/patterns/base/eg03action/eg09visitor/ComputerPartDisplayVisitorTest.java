package com.github.bjlhx15.patterns.base.eg03action.eg09visitor;

import org.junit.Test;

public class ComputerPartDisplayVisitorTest {

    @Test
    public void visit() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}