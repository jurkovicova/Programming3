package Shapes;

import java.awt.*;
public class Circle extends Shape {
    private final int r; // Fields

    public Circle(Point initPos, Color col, int r){
        super(initPos, col); // The constructor
        this.r=r; // Initialize fields
    }
    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillOval(pos.x,pos.y,r, r);
    }

}