package com.bvan.oop.lessons7_8.wrapper;

/**
 * @author bvanchuhov
 */
public class IntegerExample {

    public static void main(String[] args) {
        Integer x = 10; // int -> Integer: Integer.valueOf(10)
        Integer y = 20; // int -> Integer: Integer.valueOf(10)
        Integer z = x + y; // Integer.valueOf(x.intValue() + y.intValue())

        System.out.println(z);
    }
}
