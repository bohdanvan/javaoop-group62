package com.bvan.oop.lessons11_12.multithreading;

import com.bvan.oop.lessons11_12.multithreading.bar.Drinker;
import com.bvan.oop.lessons11_12.multithreading.util.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class SleepAndJoinExample {

    public static void main(String[] args) {
        Thread drinkerThread = new Thread(new Drinker());
        drinkerThread.start();

        try {
            drinkerThread.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadUtils.println("Bar is closed");
    }
}
