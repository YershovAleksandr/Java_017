package com.nam.visitor_pattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
