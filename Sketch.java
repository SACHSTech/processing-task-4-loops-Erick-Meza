import processing.core.PApplet;

public class Sketch extends PApplet {
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Draws all quadrants and shapes in their respective quadrants
   */
  public void draw() {

    // initializes variables 
    int intColour = 0;
    float fltAngle = 0;

    // draws the 10 x 10 grid in quadrant 1
    for (int intVerticalLines = 0; intVerticalLines <= width / 2; intVerticalLines += (width / 2) / 10){
      stroke(0,0,0);
      line(intVerticalLines, 0, intVerticalLines, height / 2);
    }
    for (int intHorizontalLines = 0; intHorizontalLines <= height / 2; intHorizontalLines += (width / 2) / 10){
      stroke(0,0,0);
      line(0, intHorizontalLines, width / 2, intHorizontalLines);
    }

    //draws the black to white gradient in quadrant 3
    for (int intLines = 0; intLines <= width / 2; intLines++){
      intColour = intColour + 1;
      stroke(intColour,intColour,intColour);
      line(intLines, height / 2, intLines, height + 10);
    }

    // Creates a 5 x 5 grid of pink circles
    for (int intcircleYAxis = height / 18; intcircleYAxis < height / 2; intcircleYAxis += (height / 2) / 5) {
      for (float intcircleXAxis = width / (float) (1.8); intcircleXAxis < width; intcircleXAxis += (width / 2) / 5) {
        stroke(0,0,0);
        fill(255,50,200);
        ellipse(intcircleXAxis, intcircleYAxis, width / 25, height / 25);
      }
    }
    
    // Tanslates the following shapes into their respective positions
    translate(width * (float) (0.75), height * (float) (0.75));

    // Creates a for loop to draw the flower petals in quadrant 4
    for(int i = 0; i <= 4; i++){
      rotate(radians(fltAngle));
      fill(220,93,52);
      ellipse(0, 0, width / 20, height / (float) (2.5));
      fltAngle = fltAngle + 45;
    }

    // Draws the center of the flower in quadrant 4
    stroke(0,0,0,0);
    fill(38,108,45);
    ellipse(0, 0, width / 10, height / 10);
    }
  }