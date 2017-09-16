package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getArea() {
        double areaSum = 0.0;
        for (Shape shape : shapes) {
            areaSum += shape.getArea();
        }
        return areaSum;
    }
}
