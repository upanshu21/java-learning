package com.upanshu.java.learning.generics.animalKingdom;

public class PrintAnimal <T extends Animal>{

    T whichAnimalToPrint;

    public PrintAnimal(T whichAnimalToPrint) {
        this.whichAnimalToPrint = whichAnimalToPrint;
    }

    public void printAnimal() {
        whichAnimalToPrint.printAnimalDetails();
    }


}
