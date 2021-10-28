package Shapes;

import java.awt.*;
public class Rect extends Shape {
    private int width;
    private int height;// Fields

    public Rect(Point initPos, Color col, int w, int h){ // The constructor
        super(initPos, col);
        width=w; // Initialize fields
        height=h;

    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width, height);
    }

}
