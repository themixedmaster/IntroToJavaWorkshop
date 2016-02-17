package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot derp = new Robot();
	
	void go() {
		derp.penDown();

		// 6. Make the robot go as fast as possible
	derp.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
	int length2 = 50;
		// 7. Do the following (up to step 10) 60 times
	for (int i = 0; i < 100; i++) {
		
	
			// 9. Change the color of the pen to a random color
	derp.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
	derp.move(1*i);
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(180);
			// 10. Turn the tortoise 6 degrees to the right
	derp.turn(6);
								}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
	derp.move(length);
	derp.turn(360 / 3);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
