package com.bvan.oop.lessons11_12.multithreading.bar;

import com.bvan.oop.lessons11_12.multithreading.util.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class SimpleBar {

    public static void main(String[] args) {
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();

        ThreadUtils.println("Bar is closed");
    }
}

