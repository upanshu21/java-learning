package com.upanshu.java.learning.executorframework;

import org.springframework.stereotype.Component;

import java.util.concurrent.*;

@Component
public class Exec implements Runnable {

    private final Task task;

    public Exec(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        ExecutorService exec = Executors.newFixedThreadPool(1);

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Future<String> result = scheduledExecutorService.submit(task);
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
                    try {
                        System.out.println(result.get());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }}, 10, 10, TimeUnit.SECONDS);
    }

}
