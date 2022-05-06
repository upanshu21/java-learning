package com.upanshu.java.learning.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
source: https://www.programiz.com/java-programming/queue
Some commonly used methods of the Queue interface are:
add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
element() - Returns the head of the queue. Throws an exception if the queue is empty.
peek() - Returns the head of the queue. Returns null if the queue is empty.
remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
 */
public class LearningQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

       // System.out.println(queue);

      //  System.out.println(queue.poll());
      //  System.out.println(queue.peek());

        /*
        Since PriorityQueue is not thread-safe,
        so java provides PriorityBlockingQueue class that implements
        the BlockingQueue interface to use in java multithreading environment.
         */
        Queue<Integer> demoQueue = new PriorityQueue<>();
        demoQueue.offer(4);
        demoQueue.offer(2);
        demoQueue.offer(3);
        demoQueue.offer(1);
        demoQueue.offer(8);
        demoQueue.offer(11);
        demoQueue.offer(4);

        System.out.println(demoQueue);

//        demoQueue.poll();
//        System.out.println(demoQueue);


//        Queue<Object> dqueue = new PriorityQueue<>();
//        dqueue.offer("adfsdf");
//        dqueue.offer("sdfdsfsdvs");
//        System.out.println(dqueue);
//        System.out.println(dqueue.peek());
    }
}

