package org.example.shapes;

import org.example.Shape;

public class Star extends Shape {
    @Override
    public String getName() {
        return "Shape star look amazing";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Star");
    }
}
