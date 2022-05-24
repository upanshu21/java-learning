package com.upanshu.java.learning;

import com.upanshu.java.learning.interfaceImpl.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaLearningApplication implements ApplicationRunner {

	private final Person person;

	public JavaLearningApplication(Person person) {
		this.person = person;
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaLearningApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		person.printInformation();
	}
}
