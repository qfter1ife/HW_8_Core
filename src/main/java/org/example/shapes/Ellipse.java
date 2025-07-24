package org.example.shapes;

import org.example.Shape;

public class Ellipse extends Shape {
    @Override
    public String getName() {
        return "Ellipse";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Ellipse");
    }
}
