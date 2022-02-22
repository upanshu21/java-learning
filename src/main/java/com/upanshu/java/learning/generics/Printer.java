package com.upanshu.java.learning.generics;


public class Printer <T> {

    T canPrintAnything;

    public Printer(T canPrintAnything) {
        this.canPrintAnything = canPrintAnything;
    }

    public void printThis() {
        System.out.println("I am generic and this time I will print " + canPrintAnything);
    }
}
