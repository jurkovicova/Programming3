import java.awt.*;
public class Circle {
    private int rad; // Fields
    private Point pos;
    private Color col;
    public Rect(Point initPos, Color col, int width, int height){ // The constructor
        w=width; // Initialize fields
        hi=height;
        this.col=col;
    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width, height);
    }

}
