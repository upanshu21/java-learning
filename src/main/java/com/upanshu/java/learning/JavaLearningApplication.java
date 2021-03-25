package com.upanshu.java.learning;

import com.upanshu.java.learning.singletondb.SingletonExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaLearningApplication.class, args);

		SingletonExample instanceOne = SingletonExample.getSingletonExampleInstance();
		System.out.println(instanceOne);

		SingletonExample instanceTwo = SingletonExample.getSingletonExampleInstance();
		System.out.println(instanceTwo);
	}

}
