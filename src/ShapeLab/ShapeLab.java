package ShapeLab;
//  PROJECT: SHAPE LAB
//  Created 2017 by TEALS APCS team at Bellevue International High School.
//  Avoid modifying this file, though you are encouraged to examine it to see how
//  it implements the functionality of displaying shapes using the
//  underlying support in the Processing library.
import processing.core.PApplet;
import processing.core.PConstants;

// Class ShapeLab provides methods to display geometric shapes
public class ShapeLab {
    private static PApplet pa;
    private static int backgroundColor;
    private static int POINT_RADIUS = 3; // Radius of a point when drawn.
    private static int LINE_WIDTH = 2;
    private static int BORDER_WIDTH = 1;

    // Set's up the static pa object.
    public static void setPApplet(PApplet pa) {
        ShapeLab.pa = pa;
        ShapeLab.backgroundColor = pa.color(200, 200, 200); // Light gray background
        pa.background(ShapeLab.backgroundColor);
        pa.textAlign(PConstants.CENTER, PConstants.CENTER); // centers text within specified rectangle.
        pa.ellipseMode(PConstants.RADIUS); // Treat 3rd and 4th arguments to pa.ellipse as rx and ry radii 
    }

    // Clears the display
    public static void clearDisplay() {
        pa.background(ShapeLab.backgroundColor);
    }

    // Displays a single point.
    public static void drawPoint(Point p) {
        pa.fill(0); // Black color
        pa.noStroke();
        pa.ellipse((float)p.x, (float)p.y, POINT_RADIUS, POINT_RADIUS);
    }

    // Displays a single line.
    public static void drawLine(Line li) {
        pa.strokeWeight(LINE_WIDTH);
        pa.stroke(0);
        pa.line((float)li.x1, (float)li.y1, (float)li.x2, (float)li.y2);
    }

    // Displays a single rectangle.
    public static void drawRectangle(Rectangle rect) {
        prepStyle(rect.color, rect.borderless);
        pa.rect((float)rect.x, (float)rect.y, (float)rect.width, (float)rect.height);
        drawText(rect.label, rect.x, rect.y, rect.width, rect.height);
    }

    // Displays a single ellipse.
    public static void drawEllipse(Ellipse e) {
        prepStyle(e.color, e.borderless);
        pa.ellipse((float)e.cx, (float)e.cy, (float) e.rx, (float) e.ry);
        drawText(e.label, e.cx-e.rx, e.cy-e.ry, 2*e.rx, 2*e.ry);
    }

    // Displays a single triangle.
    public static void drawTriangle(Triangle t) {
        prepStyle(t.color, t.borderless);
        pa.triangle((float)t.x1, (float)t.y1, (float)t.x2, (float)t.y2, (float)t.x3, (float)t.y3);
        // Center is arithmetic mean of points.
        double cx = (t.x1+t.x2+t.x3)/3;
        double cy = (t.y1+t.y2+t.y3)/3;
        drawText(t.label, cx, cy, 0, 0); // widht or height of 0 implies don't use widht and height.
    }

    /*
     ********************************************* ALL METHODS BELOW ARE PRIVATE METHODS *************************************************
     */
    
    // Setup the border and fill color ahead of drawing
    private static void prepStyle(int color, boolean borderless) {
        pa.fill(color);
        if (borderless) {
            pa.noStroke();            
        } else {
            pa.stroke(0);
            pa.strokeWeight(BORDER_WIDTH);
        }
        
    }
    
    // Conditionally draw text
    // If either width or height is 0 (or rather < 1.0) both fields are ignored.
    private static void drawText(String text, double x, double y, double width, double height) {
        if (text!=null) {
            pa.fill(0);
            if (width<1 || height<1) {
                pa.text(text, (float)x, (float)y);
            } else {
                pa.text(text, (float)x, (float)y, (float)width, (float)height);

            }
        }
    }

}
