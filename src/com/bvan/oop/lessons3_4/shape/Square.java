package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Square implements Shape {

    private final Rectangle rectangle;

    public Square(double side) {
        rectangle = new Rectangle(side, side);
    }

    public double getArea() {
        return rectangle.getArea();
    }

    public double getPerimeter() {
        return rectangle.getPerimeter();
    }

    public double getSide() {
        return rectangle.getWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                '}';
    }
}
