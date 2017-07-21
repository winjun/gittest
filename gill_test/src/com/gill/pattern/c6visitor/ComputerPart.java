package com.gill.pattern.c6visitor;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}