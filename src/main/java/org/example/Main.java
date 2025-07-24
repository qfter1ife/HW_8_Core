package org.example;

import org.example.shapes.*;

public class Main {
    public static void main(String[] args) {
       Draw draw = new Draw();
        Circle circle = new Circle();
        Ellipse ellipse = new Ellipse();
        Quadrangle quadrangle = new Quadrangle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Star star = new Star();

draw.drawShape(circle);
draw.drawShape(ellipse);
draw.drawShape(quadrangle);
draw.drawShape(rectangle);
draw.drawShape(square);
draw.drawShape(star);

        }
    }

class Draw{
void drawShape(Drawable drawable){
    drawable.draw();
}
}
