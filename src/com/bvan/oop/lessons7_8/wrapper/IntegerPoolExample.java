package com.bvan.oop.lessons7_8.wrapper;

/**
 * @author bvanchuhov
 */
public class IntegerPoolExample {

    public static void main(String[] args) {
        Integer x1 = 100;
        Integer x2 = 100;

        Integer y1 = 200;
        Integer y2 = 200;

        System.out.println(x1 == x2);
        System.out.println(y1 == y2);

        System.out.println(x1.equals(x2));
        System.out.println(y1.equals(y2));
    }
}
