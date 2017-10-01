package com.bvan.oop.lessons7_8.comparing;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(30, 30)); // 0
        System.out.println(Integer.compare(100, 50)); // > 0

        System.out.println();

        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println("Home".compareTo("Home")); // 0
    }
}
