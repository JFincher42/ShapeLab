package ShapeLab;

public class Canvas {
	int displayWidth;
	int displayHeight;

	// Add additional instance variables here...
	Rectangle r;

	// Constructor…
	public Canvas(int w, int h) {
		displayWidth = w;
		displayHeight = h;
		r = new Rectangle(10, 20, 30, 40); // This assumes Rectangle already has a constructor
	}

	// This method  will be called approximately 30 times per second.
	// The input parameter will be set to the current animation frame.
	// It starts out at 1 and increments by 1 for each successive call.
	void animate(int frame) {
		ShapeLab.clearDisplay();
		ShapeLab.drawRectangle(this.r);
		r.x = (r.x+1) % displayWidth;
		if (frame % 40 == 0) {
			r.y += 10;
		}
	}
}
