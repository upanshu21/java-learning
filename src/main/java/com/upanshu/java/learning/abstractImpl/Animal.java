package com.upanshu.java.learning.abstractImpl;

import org.springframework.stereotype.Component;

@Component
public abstract class Animal {

    String name;
    int age;

    abstract void type();

    void print() {
        System.out.println("hello");
    }

}
