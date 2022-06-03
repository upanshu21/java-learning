package com.upanshu.java.learning.executorframework;

import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

@Component
public class Task implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "helloooooooooooo";
    }
}
