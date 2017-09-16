package com.bvan.oop.lessons3_4.shape.runner;

import com.bvan.oop.lessons3_4.shape.Circle;
import com.bvan.oop.lessons3_4.shape.EquilateralTriangle;
import com.bvan.oop.lessons3_4.shape.Rectangle;
import com.bvan.oop.lessons3_4.shape.Shapes;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        shapes.add(new Rectangle(10.0, 20.0)); // 200
        shapes.add(new Circle(10.0)); // 314
        shapes.add(new EquilateralTriangle(10.0)); // 43

        System.out.println(shapes.getArea()); // 557
    }
}
