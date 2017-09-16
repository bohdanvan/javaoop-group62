package com.bvan.oop.lessons3_4.shape.runner;

import com.bvan.oop.lessons3_4.shape.Circle;
import com.bvan.oop.lessons3_4.shape.Rectangle;
import com.bvan.oop.lessons3_4.shape.Shape;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        System.out.println(rectangle.getArea());

        Circle circle = new Circle(10.0);
        System.out.println(circle.getArea());

        Shape shape = circle;
        printShapeInfo(shape);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Shape: ");
        System.out.println("S = " + shape.getArea());
        System.out.println("P = " + shape.getPerimeter());
    }
}
