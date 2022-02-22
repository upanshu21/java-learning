package com.upanshu.java.learning.generics.animalKingdom;

public class Cat  extends Animal{

    private String whatColourOfCat;

    public Cat(String whatColourOfCat) {
        this.whatColourOfCat = whatColourOfCat;
    }

    public Cat() {

    }

    public void printCatType() {
        System.out.println("I am a black cat");
    }

}
