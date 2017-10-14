package com.bvan.oop.lessons11_12.multithreading.bar;

import com.bvan.oop.lessons11_12.multithreading.bar.Drinker;
import com.bvan.oop.lessons11_12.multithreading.util.ThreadUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class ExecutorServiceBar {

    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newCachedThreadPool();

        for (int drinker = 0; drinker < 3; drinker++) {
            Runnable task = new Drinker();
            executorService.submit(task);
        }
        executorService.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
