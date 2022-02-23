package com.upanshu.java.learning.multithreading.join;

public class ThreadJoining extends Thread {

    @Override
    public void run() {

        for(int i = 0; i< 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Current Thread is " + Thread.currentThread().getName());
           // System.out.println(Thread.currentThread().);
        }
    }
}
