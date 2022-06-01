package com.upanshu.java.learning.parent;

public class AnimalChild extends AnimalParent{

    @Override
    public void eat() {
        super.eat();
        System.out.println(super.age);
        System.out.println("nhi khara");
    }

    public static void main(String[] args) {
        AnimalParent a = new AnimalChild();
        a.eat();
    }
}
