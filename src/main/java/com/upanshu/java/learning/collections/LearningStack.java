package com.upanshu.java.learning.collections;

import java.util.Stack;

public class LearningStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for(Integer elem: stack) {
            System.out.println(elem);
        }

        System.out.println("peek: " + stack.peek());
        System.out.println(stack.pop());
    }
}
