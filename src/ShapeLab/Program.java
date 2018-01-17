package ShapeLab;
import processing.core.PApplet;
//
// PROJECT: SHAPE LAB
// Created in 2017 by the TEALS APCS team at Bellevue International
//
// (Main) Program class
// START with method runAllActivities().
public class Program extends PApplet {
	public static final int WIDTH = 720;  // width of display in pixels   
	public static final int HEIGHT = 720; // height of display in pixels

	// Uncomment the line below for Activity 3 and 4
	//Canvas canvas;

	/**
	 *  DO NOT MODIFY
	 * Launch the Processing Application.
	 *  Calls settings() once, then setup() once, then draw() 30 times per second.
	 * @param args - Program arguments are ignored.
	 */
	public static void main(String args[]) {
		String packageFilename = "ShapeLab.Program";
		PApplet.main(new String[] { packageFilename });
	}

	/**
	 * DO NOT MODIFY
	 * Sets the Application Properties.
	 */
	public void settings() {
		size(WIDTH,HEIGHT); // Set size of screen
	}

	/**
	 * DO NOT MODIFY
	 * Program initialization.
	 */
	public void setup() {
		ShapeLab.setPApplet(this);
		// Uncomment the line below for Activity 3 and 4
		//canvas = new Canvas(WIDTH, HEIGHT);

		// Comment the line below for Activity 3 and 4
		noLoop();
	}

	/**
	 * DO NOT MODIFY
	 * Runs some simple tests, clears the display
	 * and then calls the methods for the various Lab activities.
	 */
	public void draw() {
		ShapeLabTester tester = new ShapeLabTester();
		//tester.basicTest();
		//tester.gridTest();
		ShapeLab.clearDisplay(); // Clear the display after running the tests
		runAllActivities();

		// For Activity 3 and 4, comment out the above code, and uncomment the below code.
		//canvas.animate(frameCount);		// frameCount is defined in PApplet.
	}

	/**
	 * ***********************************************************
	 *                        START HERE
	 * ***********************************************************                           
	 * Call any additional activities you add from this method.
	 */
	public static void runAllActivities() {
		introActivity();
	}

	// This is the introductory activity
	public static void introActivity() {
		Rectangle r = new Rectangle();
		r.x = 100;
		r.y = 50;
		r.width = 200;
		r.height = 100;
		r.label = "This is a rectangle!";
		r.color = Color.makeColor(0, 128, 128); // The color teal (0% red, 50% green, 50% blue)
		ShapeLab.drawRectangle(r);
	}
}
