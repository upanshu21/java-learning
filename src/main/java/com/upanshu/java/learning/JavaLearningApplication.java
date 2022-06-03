package com.upanshu.java.learning;

import com.upanshu.java.learning.executorframework.Exec;
import com.upanshu.java.learning.multithreading.MultiThreadingByRunnable;
import com.upanshu.java.learning.multithreading.MultiThreadingExample;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaLearningApplication implements ApplicationRunner {

	public final Exec exec;

	public JavaLearningApplication(Exec exec) {
		this.exec = exec;
	}

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(JavaLearningApplication.class, args);
//		MultiThreadingExample multiThreadingExample = new MultiThreadingExample();
//		System.out.println(multiThreadingExample.getName());
//		System.out.println(multiThreadingExample.getThreadGroup());
//		multiThreadingExample.start();
//		//multiThreadingExample.run();
//
		MultiThreadingByRunnable a = new MultiThreadingByRunnable();
		Thread runnableImpl = new Thread(a);
		Thread runnableImplTwo = new Thread(a);
		System.out.println(runnableImpl.getThreadGroup());
		System.out.println(runnableImpl.getName());
		System.out.println(runnableImplTwo.getThreadGroup());
		System.out.println(runnableImplTwo.getName());
		runnableImpl.start();
		runnableImpl.join();
		runnableImplTwo.start();
//		//runnableImpl.run();
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		exec.run();
	}
}
