package com.upanshu.java.learning.interfaceImpl;

public interface Person {

    void printInformation();

    default void print() {
        System.out.println("default prints");
    }

}
