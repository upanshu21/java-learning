package com.upanshu.java.learning.multithreading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MultiThreadingByRunnable implements Runnable{

    private final static Logger log = LoggerFactory.getLogger(MultiThreadingByRunnable.class);
    @Override
    public void run() {
        log.info("This class implements the runnable interface");
        for(int i = 0; i <5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
