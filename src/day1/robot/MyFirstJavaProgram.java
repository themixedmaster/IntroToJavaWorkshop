package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
	Robot derp = new Robot();
	derp.setSpeed(50);
	derp.penDown();
	for (int i = 0; i < 12; i++) {
	derp.move(10);
	derp.turn(10);	
	}
	
	
	}
}
