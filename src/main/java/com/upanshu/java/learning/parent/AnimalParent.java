package com.upanshu.java.learning.parent;

public class AnimalParent {

    int age = 1;
    String name = "haha";

    public AnimalParent() {}

    public AnimalParent(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void makeNoise() {
        System.out.println("Hello");
    }

    public void eat() {
        System.out.println("Khana kha lo frands");
    }
}
