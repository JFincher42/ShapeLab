package ShapeLab;
//  PROJECT: SHAPE LAB
//  Created 2017 by TEALS APCS team at Bellevue International High School.
//
// Class Ellipse maintains the state of a single
// ellipse that has a color and an optional text label
public class Ellipse
{
    // Coordinates of center
    double cx;
    double cy;

    // Radii in two dimensions
    double rx;
    double ry; 

    // Some more attributes of the ellipse...
    int color=Color.WHITE; // Color of the rectangle defaults to white(255). Use Color.makeColor(r, g, b) to set it to some other color.
    String label; // text label
    boolean borderless; // Defaults to borderless == false, i.e., border is present by default.

    // ===============================================================================================================
    // DO NOT CHANGE ANY FIELDS DEFINED *ABOVE* THIS LINE - they are used by the ShapeLab class to draw the object.
    // You may add additional fields and methods below this line - they will be ignored by the ShapeLab class.
    // For example, you may want to add a constructor!
}