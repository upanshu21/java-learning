package com.upanshu.java.learning.abstractImpl;

import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@Component
public class Dog extends Animal {

    @Override
    void type() {
        System.out.println("extended");
    }

    public static void main(String[] args) {

        Set<String> b = new TreeSet<>();

        Set<String> c = new LinkedHashSet<>();

        Dog a = new Dog();
        a.print();
        a.age = 10;
    }
}
