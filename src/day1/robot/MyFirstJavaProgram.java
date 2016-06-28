package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot Kinder = new Robot();
        Kinder.penDown();
        Kinder.setPenWidth(100);
		Kinder.setPenColor(0, 230, 238);
		Kinder.move(500);
		Kinder.turn(90);
		Kinder.setPenColor(0, 138,221);
		Kinder.move(500);
		Kinder.turn(90);
		Kinder.move(500);
		Kinder.turn(90);
	    Kinder.move(500);

	    
	    for (int i = 0; i < args.length; i++) {
	    Kinder.move(100);
	    Kinder.turn(90);
}
	}		
}









