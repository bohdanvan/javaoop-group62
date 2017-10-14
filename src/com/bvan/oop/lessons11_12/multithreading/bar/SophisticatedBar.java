package com.bvan.oop.lessons11_12.multithreading.bar;

/**
 * @author bvanchuhov
 */
public class SophisticatedBar {

    public static void main(String[] args) {
        new Drinker(0).run();

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Drinker(1).run();
                new Drinker(2).run();
            }
        }).start();

        new Drinker(3).run();
    }
}
