package com.upanshu.java.learning.generics.animalKingdom;

public class Dog extends Animal{

    private String whatColourOfDog;

    public Dog(String whatColourOfDog) {
         this.whatColourOfDog = whatColourOfDog;
    }

    public Dog() {

    }

    public void printColourOfDog() {
        System.out.println("I am a black dog");
    }
}
