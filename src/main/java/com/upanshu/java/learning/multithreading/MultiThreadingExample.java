package com.upanshu.java.learning.multithreading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MultiThreadingExample extends Thread{

    private final static Logger log = LoggerFactory.getLogger(MultiThreadingExample.class);
    @Override
    public void run() {
        log.info("This class extends Thread class for multithreading");
        for(int i = 0; i <5; i++) {
            System.out.println(i);
            System.out.println(Thread.interrupted());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
