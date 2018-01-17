package ShapeLab;
//  PROJECT: SHAPE LAB
//  Created 2017 by TEALS APCS team at Bellevue International High School.
//  Avoid modifying  this file, though you are encouraged to examine it to see how
//  one writs very simple unit tests that test the functionalty of all the public methods in
//  a class.

// Class ShapeLabTester tests basic functionality of the ShapeLab class.
public class ShapeLabTester
{
	// Creates an instance of each kind of primitive, and displays three versions of it, each one shifted a bit so
	// they don't overlap
	public void basicTest() {
		ShapeLab.clearDisplay();
		Rectangle r = makeRect(10, 20, 30, 40, "R1");
		Line li = makeLine(10, 20, 10+30, 20+40); // Should run from upper-left to lower-right of the above rectangle
		Ellipse e = makeEllipse(100, 200, 30, 40, "E1"); 
		Point p = makePoint(100,200-40); // Should touch the very top of the ellipse.
		Triangle t = makeTriangle(200, 300, 200+50, 300, 200, 300+100, "T1");

		// Give each shape a distinct color
		int rColor = Color.makeColor(255, 100, 100); // reddish
		int eColor = Color.makeColor(0, 255, 0); // green
		int tColor = Color.makeColor(100, 100, 255); // blueish
		r.color = rColor;
		e.color = eColor;
		t.color = tColor;

		// Draw them
		ShapeLab.drawRectangle(r);
		ShapeLab.drawEllipse(e);
		ShapeLab.drawPoint(p);
		ShapeLab.drawLine(li);
		ShapeLab.drawTriangle(t);

		// Remove borders, make everything white and redraw, shifting x a bit...
		e.borderless = r.borderless = t.borderless = true;
		int shift = 100;
		e.cx+= shift;
		r.x+= shift;
		t.x1+= shift;
		t.x2+= shift;
		t.x3+= shift;
		r.color = e.color = t.color = Color.WHITE;
		ShapeLab.drawRectangle(r);
		ShapeLab.drawEllipse(e);
		ShapeLab.drawTriangle(t);

		// Add borders and original colors, shifting x again...
		e.borderless = r.borderless = t.borderless = false;
		e.cx+= shift;
		r.x+= shift;
		t.x1+= shift;
		t.x2+= shift;
		t.x3+= shift;
		r.color = rColor;
		e.color = eColor;
		t.color = tColor;
		ShapeLab.drawRectangle(r);
		ShapeLab.drawEllipse(e);
		ShapeLab.drawTriangle(t);

	}

	// Creates a 2D array of triangles and displays 3 versions of them
	public void gridTest() {
		ShapeLab.clearDisplay();
		int nx = 3;
		int ny = 3;
		int gridDX = Program.WIDTH/nx;
		int gridDY = Program.HEIGHT/ny;
		// Your code goes here 
		Rectangle[][] rects = new Rectangle[ny][nx];
		for (int i = 0; i< rects.length; i++) {
			for (int j= 0; j< rects[i].length; j++) {
				String name = "["+i+","+j+"]";
				Rectangle r = makeRect(j*gridDX, i*gridDY, 50, 50, name);
				rects[i][j] = r;
				ShapeLab.drawRectangle(rects[i][j]);
			}
		}

		// Make borderless and colored ...
		for (int i = 0; i< rects.length; i++) {
			for (int j= 0; j< rects[i].length; j++) {
				String name = "["+i+","+j+"]";
				Rectangle r = rects[i][j];
				r.x+= r.width;
				r.y+= r.height;
				r.borderless = true;
				int rv = (int)(255*Math.random());
				int gv = (int)(255*Math.random());
				int bv = (int)(255*Math.random());
				r.color = Color.makeColor(rv, gv, bv);
				ShapeLab.drawRectangle(rects[i][j]);
			}
		}

		// Make white again
		for (int i = 0; i< rects.length; i++) {
			for (int j= 0; j< rects[i].length; j++) {
				String name = "["+i+","+j+"]";
				Rectangle r = rects[i][j];
				r.x+= r.width;
				r.y+= r.height;
				r.borderless = false;
				r.color = Color.WHITE;
				ShapeLab.drawRectangle(rects[i][j]);
			}
		}
	}

	// Assumes no custom Rectangle constructor because at the start of this project there is none.
	private Rectangle makeRect(int _x, int _y, int _width, int _height, String label) {
		Rectangle r = new Rectangle();
		r.x = _x;
		r.y = _y;
		r.width = _width;
		r.height = _height;
		r.label = label;
		return r;
	}

	// Assumes no custom Point constructor because at the start of this project there is none.
	private Point makePoint(int x, int y) {
		Point p = new Point();
		p.x = x;
		p.y = y;
		return p;
	}

	// Assumes no custom Line constructor because at the start of this project there is none.
	private Line makeLine(int x1, int y1, int x2, int y2) {
		Line li = new Line();
		li.x1 = x1;
		li.y1 = y1;
		li.x2 = x2;
		li.y2 = y2;
		return li;
	}

	// Assumes no custom Ellipse constructor because at the start of this project there is none.
	private Ellipse makeEllipse(int cx, int cy, int r1, int r2, String la) {
		Ellipse e = new Ellipse();
		e.cx = cx;
		e.cy = cy;
		e.rx = r1;
		e.ry = r2;
		e.label = la;
		e.color  = Color.makeColor(255, 0, 0);
		return e;
	}

	// Assumes no custom Triangle constructor because at the start of this project there is none.
	private Triangle makeTriangle(int x1, int y1, int x2, int y2, int x3, int y3, String la) {
		Triangle t = new Triangle();
		t.x1 = x1;
		t.y1 = y1;
		t.x2 = x2;
		t.y2 = y2;
		t.x3 = x3;
		t.y3 = y3;
		t.label = la;
		t.color  = Color.makeColor(0, 255, 0);
		return t;
	}

}
