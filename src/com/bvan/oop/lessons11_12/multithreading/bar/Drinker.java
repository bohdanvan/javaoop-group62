package com.bvan.oop.lessons11_12.multithreading.bar;

import com.bvan.oop.lessons11_12.multithreading.util.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId = 0;

    private final int id;

    public Drinker(int id) {
        this.id = id;
    }

    public Drinker() {
        this(nextId++);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ThreadUtils.println(drinkerInfo() +
                    "I'm drinking beer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String drinkerInfo() {
        return "I'm " + id + " drinker. ";
    }
}
