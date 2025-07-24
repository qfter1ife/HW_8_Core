package org.example.shapes;

import org.example.Drawable;
import org.example.Shape;

public class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
