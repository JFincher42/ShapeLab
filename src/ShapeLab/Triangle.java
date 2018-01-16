package ShapeLab;
//  PROJECT: SHAPE LAB
//  Created 2017 by TEALS APCS team at Bellevue International High School.
//
// Class Triangle maintains the state of a single triangle.
public class Triangle
{
    // Coordinates of the first point
    double x1;
    double y1;

    // Coordinates of the second point
    double x2;
    double y2;
    
    // Coordinates of the third point
    double x3;
    double y3;
    
    // Some more attributes of the triangle...
    int color=Color.WHITE; // Color of the rectangle defaults to white(255). Use Color.makeColor(r, g, b) to set it to some other color.
    String label; // text label
    boolean borderless; // Defaults to borderless == false, i.e., border is present by default.

    // ===============================================================================================================
    // DO NOT CHANGE ANY FIELDS DEFINED *ABOVE* THIS LINE - they are used by the ShapeLab class to draw the object.
    // You may add additional fields and methods below this line - they will be ignored by the ShapeLab class.
    // For example, you may want to add a constructor!
}