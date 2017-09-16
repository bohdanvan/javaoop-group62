package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class MockShape implements Shape {

    private final double area;
    private final double perimeter;

    public MockShape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "MockShape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
