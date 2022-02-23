package com.upanshu.java.learning;

import com.upanshu.java.learning.generics.Printer;
import com.upanshu.java.learning.generics.StringPrinter;
import com.upanshu.java.learning.generics.animalKingdom.Cat;
import com.upanshu.java.learning.generics.animalKingdom.PrintAnimal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

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

		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		printList(integerList);

		List<String> stringList = new ArrayList<>();
		stringList.add("hehe");
		printList(stringList);
	}

	/// <?> is a wildcard which means that the List is of generic type
	private static void printList(List<?> myList) {
		for (Object o : myList) {
			System.out.println(o);
		}
	}

}
