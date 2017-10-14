package com.bvan.oop.lessons11_12.multithreading;

import com.bvan.oop.lessons11_12.multithreading.util.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class AnonymousRunnable {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.println("1");
            }
        }).start();

        ThreadUtils.println("2");
    }
}
