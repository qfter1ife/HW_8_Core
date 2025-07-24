package org.example.shapes;

import org.example.Drawable;
import org.example.Shape;

public class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
