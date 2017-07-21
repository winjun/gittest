package com.gill.pattern.c6visitor;

public class VisitorMain {
   public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}