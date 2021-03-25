package com.upanshu.java.learning.singletondb;

public class SingletonExample {

    private static SingletonExample singletonExampleInstance = null;

    private SingletonExample() {}

    public static SingletonExample getSingletonExampleInstance() {
        if(singletonExampleInstance == null) {
            singletonExampleInstance = new SingletonExample();
        }
        return singletonExampleInstance;
    }
}
