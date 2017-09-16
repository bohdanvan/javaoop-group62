package com.bvan.oop.lessons3_4.shape.runner;

import com.bvan.oop.lessons3_4.shape.Rectangle;
import com.bvan.oop.lessons3_4.shape.Shape;

/**
 * @author bvanchuhov
 */
public class DowncastingExample {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10.0, 20.0);

        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.getWidth());
        } else {
            System.out.println("This not a rectangle");
        }
    }
}
