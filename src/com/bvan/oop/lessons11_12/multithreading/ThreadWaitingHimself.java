package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadWaitingHimself {

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}
