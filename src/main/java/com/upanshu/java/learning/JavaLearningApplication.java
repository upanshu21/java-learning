package com.upanshu.java.learning;

import com.upanshu.java.learning.multithreading.MultiThreadingByRunnable;
import com.upanshu.java.learning.multithreading.MultiThreadingExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaLearningApplication.class, args);
		MultiThreadingExample multiThreadingExample = new MultiThreadingExample();
		multiThreadingExample.start();

		Thread runnableImpl = new Thread(new MultiThreadingByRunnable());
		runnableImpl.start();
	}

}
