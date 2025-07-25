package org.example.shapes;

import org.example.Shape;

public class Star extends Shape {
    @Override
    public String getName() {
        return "Star shape";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Star");
    }
}
