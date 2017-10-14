package com.bvan.oop.lessons11_12.multithreading;

import com.bvan.oop.lessons11_12.multithreading.util.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class DaemonExample {

    public static void main(String[] args) {
        Thread musicThread = new Thread(new MusicPlayer());
        musicThread.setDaemon(true);
        musicThread.start();

        ThreadUtils.sleep(3000);
        ThreadUtils.println("Main is finished");
    }
}

class MusicPlayer implements Runnable {

    @Override
    public void run() {
        while (true) {
            ThreadUtils.println("Music...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                lastAction();
                return;
            }
        }
    }

    private void lastAction() {
        ThreadUtils.println("Music is stopped");
    }
}
