import Shapes.Circle;
import Shapes.Rect;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Circle circle;
    private Rect rectangle;

    // The constructor
    public Drawing() {
        Point p_circle=new Point(200,200);
        Point p_rect=new Point(200,50);
        Color c=new Color(0xC47CA2);
        int rad = 40;
        int width = 100;
        int height = 30;
        circle = new Circle(p_circle, c, rad);
        rectangle = new Rect(p_rect,c,width,height);
        setUpFrame();
        setUpCanvas();
    }

    private void setUpCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setUpFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g) {
        rectangle.draw(g);
        circle.draw(g);

    }
}
