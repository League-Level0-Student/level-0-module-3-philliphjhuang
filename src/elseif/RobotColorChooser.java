
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the robot to draw

		// 4. use an if/else statement to set the pen color that the user requested

		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 2. set the pen width to 10

		// 1. make the robot draw a shape (this will take more than one line of code)
		Robot x = new Robot();
		x.setSpeed(20);
		x.penDown();
		x.setPenWidth(10);
		for (int i = 0; i < 4; i++) {
			String a = JOptionPane.showInputDialog("Choose a color (red,blue,green,pink)");

			if (a.equalsIgnoreCase("red")) {
				x.setPenColor(Color.RED);

			} else if (a.equalsIgnoreCase("blue")) {
				x.setPenColor(Color.BLUE);

			} else if (a.equalsIgnoreCase("green")) {
				x.setPenColor(Color.GREEN);

			} else if (a.equalsIgnoreCase("pink")) {
				x.setPenColor(Color.PINK);

			} else {
				x.setRandomPenColor();
			}

			drawShape(x);
		}
	}

	static void drawShape(Robot x) {
		for (int i = 0; i < 4; i++) {
			x.move(200);
			x.turn(90);
		}
	}
}
