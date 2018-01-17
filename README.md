ShapeLab - OOP Applied to 2D Graphics
=====================================
We will explore aspects of object oriented programming by designing and drawing two dimensional shapes, using the the Processing library.   
**Points: 45 Functionality + 20 Style + 15 EC**

Introduction
------------
For this lab, you will write code to draw points, lines, rectangles, ellipses, and triangles.  By creating objects to implement these shapes, you practice OOP principles by:
* Creating multiple object instances,
* Creating and using arrays of objects, and
* Composing new objects from existing objects.

By using objects to draw shapes on the screen, you will easily visualize the results, create more complex and sophisticated graphics, and get immediate visual feedback.  You also gain experience adding code to an existing program.

As with PixelLab, this project uses the [Processing](http://processing.org) library to provide graphic drawing capabilities.

Classes
-------
ShapeLab provides you with basic implementations of the following shape classes:
* Point.java
* Line.java
* Rectangle.java
* Ellipse.java
* Triangle.java

The following helper classes are also provided:
* Color.java, which provides static methods to create and convert colors,
* Canvas.java, which provides animation services used in Activites 3 and 4,
* Shapelab.java, which provides methods for creating the display and drawing the shape objects,  
* ShapeLabTest.java, used for testing, and
* Program.java, the entry point for your project.

Getting Started
---------------  
Open the ShapeLab project, then open Program.java and run it.

Verify that a new window is opened, and a teal-colored rectangle with a label that reads "This is a rectangle!" is displayed.

Examine the code in the `Program` class.  You will find a method called `Program.runAllActivities()`, which currently only calls `Program.introActivity()`.  As you add new methods to the various shape classes, you will add calls to the `Program.runAllActivities()` method.

Experiment with the `ShapeLabTester.basicTest()` and `ShapeLabTester.gridTest()` methods.  How would you get them to display?  Can you make changes to what is displayed?    

Activity 1: Geometric Primitives (10 points + 5 EC)
--------------------------------
In this activity, you will draw all the basic shapes, and add new constructors to understand how to modify your code to use new object features.

1. (5 points) Modify `Program.introActivity()` so that it creates and displays examples of all the geometric primitives (Point, Line, Rectangle, Ellipse and Triangle).
    * Use different colors and labels where available.
    * Save screenshots showing each type (it could be one display showing multiple geometric types) to the images folder.
2. (5 points) Add a new constructor to at least two (2) primitive types.
    * The new constructor should remove the need to setting up the shapes field variables.
    * Modify the code you added in `Program.introActivity()` so that it calls this constructor.
3. (EC: 5 points): Add new constructors to all five (5) primitive shape types, and modify the code to use them.

Make sure you commit and push your code to GitHub after completion of this activity.

**NOTE**: There is no penalty for pushing your code to GitHub multiple times.  Whenever you have a working result, even a partial result or a result with potential errors, commit and push your code to GitHub with an appropriate comment.
    
Activity 2: Make Your Own Pattern (10 points + 5 EC)
---------------------------------
In this activity, you will combine the various shapes into a single coherent pattern of your own design.

1. (2 points) Add `public static method compositePatternActivity()` to the Program class, and call it from `Program.runAllActivities()`.  Comment out `introActivity()` as necessary.
    * It should have the same signature (header) as `Program.introPatternActivity()`. The method will (eventually) draw a complex geometric pattern of your own design.
2. (8 points) Add code to `Program.compositePatternActivity()` based on these guidelines:
    * `Program.compositePatternActivity()` must draw a coherent pattern/design of your own design.
    * The pattern must use at least two (2) of each type of geometric primitive.
    * The colorable shapes (ellipses, rectangles, triangles) must be drawn with least four (4) different colors.
3. (EC: 5 points) Create a new class which encapsulates the shapes drawn in #2, and is called by a single `draw()` method.

Save a screenshot of your design to the images folder.

General coding guidelines apply, including:
* Adding comments where appropriate.
* Use program decomposition to organize your program – define additional `private` methods for sub-operations where appropriate.
* You can make changes to the methods and fields in the existing shape objects if necessary, but make sure you don't break earlier functionality by doing so (for example, changing the signature of a method you use somewhere else, or the data type of a public field). 

As always, make sure you commit and push your code to GitHub after completion of this activity.

Activity 3: Animation (10 points)
---------------------
In this activity, you will setup classes to animate shapes by repeatedly mutating and redrawing them.

To begin, follow these steps:
1. In your Program class, add a new instance variable of type Canvas.
2. Initialize the Canvas variable in the `Program.setup()` method.
    * When you do so, comment out the existing call to `noLoop()` you find there.
3. Comment out the first five (5) lines of the `Program.draw()` method, and uncomment the last line, as indicated in the method. 

When done, Answer the following questions and post them to a OneNote page called "Lab 4 - Activity 3":
* (2 points) List all instance variables of your Canvas field (just the names).
* (2 points) What is the value of `r.x` after the first call to `animate()` completes?
* (2 points) Roughly how many times will `animate()` have been called after 3 seconds have elapsed?
* (2 points) What do you expect to see when you run the program?  Actually run the program (`Program.main()` method) and report any differences.
* (2 points) Comment out the call to `ShapeLab.clearDisplay()` and explain what you see when the program is rerun.  Uncomment it (i.e., call it again) when done.
      
Activity 4: Randomly Moving Objects (15 points + 5 EC)
-----------------------------------
In this activity, you use your animation methods to move Rectangles or Ellipses around on the screen.

1. (2 points) Replace the single Rectangle instance field of the Canvas class with an array of either Rectangle or Ellipse objects (pick one, your choice).
2. (2 points) Initialize the array to contain at least five (5) of these shapes, scattered randomly across the display. Give each shape a unique label (like "A", "B", etc.  or "1", "2", etc.). This label helps you identify individual objects in the display.
3. (5 points) Animate each object in the array by randomly adjusting its position (not size or shape) each time `animate()` is called.
    * Use a for-each loop to visit each of the shapes in the array.
    * Adjust the x and y locations independently, and by small random amounts, by up to N pixels, where N is positive constant less than 5 that you decide. Note: (2*N*Math.random()-N) returns a double value between -N and N.
4. (5 points) Every K frames, change the appearance of all the shapes by turning off/on borders and/or changing color. K is constant number you decide between 20 and 50.
5. (1 point) Comment out the call to `ShapeLab.clearDisplay()` and rerun the program and save a screenshot after the program has been running for at least 15 seconds.
6. (EC: 5 points) Append a three-character suffix of your choice to the label for each shape ONLY when it overlaps another shape. It should revert back to the original label whenever it does not overlap with any other shape. Feel free to add additional instance variables to your chosen shape class to achieve this.
  
Make sure you commit and push your code to GitHub after completion of this activity.

Grading
-------
There are 45 total functionality points available, 20 style points, and 15 extra credit points.

**Functional Correctness**
- **10 points**: Activity 1 completed as indicated.
    - **5 points** Create and display all five shapes
    - **5 points** Add constructors to two (2) shape classes.  
- **10 points**: Activity 2 completed as indicated.
    - **2 points** Add `public static method compositePatternActivity()` to the Program class and call it correctly.
    - **8 points** Draw new pattern in `Program.compositePatternActivity()` as indicated.
- **10 points**: Answers to Activity 3 questions saved to OneNote  
- **15 points**: Activity 4 completed as indicated.
    - **2 points**: Replace single Rectangle with array of shapes.
    - **2 points**: Correctly initialize array of shapes.
    - **5 points**: Animate shapes with random movements
    - **5 points**: Change shape appearance regularly
    - **1 points**: Save screen shot

**TOTAL: 45 points**

**Coding Style**
- **5 points**: Readability: Indentation
- **5 points**: Readability: Meaningful method and variable names.
- **5 points**: Readability: Comments/Documentation.
- **3 points**: Efficiency: Code duplication.
- **2 points**: Efficiency: Smart algorithm.

**TOTAL: 20 points**

**EXTRA CREDIT**
- **5 points**: One or more additional constructors added to all shape classes.
- **5 points**: Add a new class to encapsulate the design in `Program.compositePatternActivity()`.
- **5 points**: Add label to animated objects when they overlap.

**TOTAL: 15 points**