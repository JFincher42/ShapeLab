package ShapeLab;
//  PROJECT: SHAPE LAB
//  Created 2017 by TEALS APCS team at Bellevue International High School.
//  Avoid modifying this file.
//  You are encouraged to examine it to see how
//  it implements the functionality of converting to and from a single
//  integer and the individual color components of red, green and blue.
//  Warning: the code makes use of bitwise operators >>, | and & which are not covered in our APCS class.

// Class Color provides static methods to convert between color representations.
// Color has no instance fields or methods. 
public class Color {
    public static final int MAX_VALUE = 255; // Max possible component value.
    // (Min value is 0.)
    public static final int WHITE = 255; // A special composite value of 255 represents white.
    public static final int BLACK = 0; // Black == all zeros.

    // These are internal constants - not accessible outside this class.
    private static final int RED_SHIFT = 16;
    private static final int GREEN_SHIFT = 8;
    private static final int BLUE_SHIFT = 0;
    private static final int ALPHA_SHIFT = 24;

    // Returns a special integer that represents a color composed of 
    // the specified amount of red, green and blue, which should each be between 0 and 255.
    // A red, green, or blue value less than 0 is interpreted as 0.
    // A red, green, or blue value greater than 255 is interpreted as 255.
    public static int makeColor(int red, int green, int blue) {
        red = (int) Math.min(MAX_VALUE, Math.max(red, 0));
        green = (int) Math.min(MAX_VALUE, Math.max(green, 0));
        blue = (int) Math.min(MAX_VALUE, Math.max(blue, 0));
        return (255<<ALPHA_SHIFT) | (red << RED_SHIFT) | (green << GREEN_SHIFT) | (blue << BLUE_SHIFT); // OR: pa.color(red, green, blue);
    }

    // This version of makeColor adds a 4th parameter - opacity.
    // Set opacity to 255 to make the shape completely opaque. Set it to 0 to make
    // it completely transparant. Applies only to the shape fill, not border.
    public static int makeColor(int red, int green, int blue, int opacity) {
        red = (int) Math.min(MAX_VALUE, Math.max(red, 0));
        green = (int) Math.min(MAX_VALUE, Math.max(green, 0));
        blue = (int) Math.min(MAX_VALUE, Math.max(blue, 0));
        opacity = (int) Math.min(MAX_VALUE, Math.max(opacity, 0));
        return (opacity<<ALPHA_SHIFT) | (red << RED_SHIFT) | (green << GREEN_SHIFT) | (blue << BLUE_SHIFT); // OR: pa.color(red, green, blue);
    }

    public static int extractRed(int color) {
        return (color >> RED_SHIFT) & 0xFF; //OR: pa.red(color);
    }

    public static int extractGreen(int color) {
        return (color >> GREEN_SHIFT) & 0xFF; //OR: pa.green(color);
    }

    public static int extractBlue(int color) {
        return (color >> BLUE_SHIFT) & 0xFF; //OR: pa.blue(color);
    }

}