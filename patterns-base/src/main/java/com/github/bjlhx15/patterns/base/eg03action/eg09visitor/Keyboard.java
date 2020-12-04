package com.github.bjlhx15.patterns.base.eg03action.eg09visitor;

public class Keyboard  implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
