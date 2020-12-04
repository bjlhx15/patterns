package com.github.bjlhx15.patterns.base.eg03action.eg09visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
