package com.upanshu.java.learning.multithreading.join;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadJoining thread1 = new ThreadJoining();
        ThreadJoining thread2 = new ThreadJoining();
        ThreadJoining thread3 = new ThreadJoining();
        ThreadJoining thread4 = new ThreadJoining();
        ThreadJoining thread5 = new ThreadJoining();

        //Thread with .join will execute before all the other threads. Once it finishes executing then other threads will execute
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
