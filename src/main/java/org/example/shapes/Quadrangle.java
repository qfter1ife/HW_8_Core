package org.example.shapes;

import org.example.Shape;

public class Quadrangle extends Shape {
    @Override
    public String getName() {
        return "Quadrangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Quadrangle");
    }
}
