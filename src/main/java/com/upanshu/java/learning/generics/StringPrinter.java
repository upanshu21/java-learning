package com.upanshu.java.learning.generics;

public class StringPrinter {

    String canOnlyPrintString;

    public StringPrinter(String canOnlyPrintString) {
        this.canOnlyPrintString = canOnlyPrintString;
    }

    public void printThing() {
        System.out.println("I can only print string " + canOnlyPrintString);
    }
}
