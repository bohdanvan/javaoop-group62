package com.bvan.oop.lessons3_4.shape.runner;

import com.bvan.oop.lessons3_4.shape.Rectangle;
import com.bvan.oop.lessons3_4.shape.Shape;

/**
 * @author bvanchuhov
 */
public class UpcastingExample {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        Shape shape = rectangle;
        double area = shape.getArea();
        System.out.println(area);

        int sum = sum(10, 20);
        System.out.println("sum = " + sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
