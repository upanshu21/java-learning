package com.upanshu.java.learning;

import com.upanshu.java.learning.generics.Printer;
import com.upanshu.java.learning.generics.StringPrinter;
import com.upanshu.java.learning.generics.animalKingdom.Cat;
import com.upanshu.java.learning.generics.animalKingdom.PrintAnimal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaLearningApplication.class, args);

		StringPrinter printer = new StringPrinter("hello");
		printer.printThing();

		Printer<Integer> printInteger = new Printer<>(10);
		printInteger.printThis();

		PrintAnimal<Cat> printCat = new PrintAnimal<>(new Cat());
		printCat.printAnimal();

		Printer<Double> printFloat = new Printer<>(10.01);
		printFloat.printThis();
	}

}
