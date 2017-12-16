package loops;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(5000);
		rob.hide();
		String o = JOptionPane.showInputDialog("What shape do you want? (square, circle,triangle)");
		String r = JOptionPane.showInputDialog("Which color? (red,blue,yellow)");
		if (r.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		} else if (r.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		} else {
			rob.setPenColor(Color.yellow);
		}

		if (o.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (o.equalsIgnoreCase("circle")) {
			drawCircle();
		} else {
			drawTriangle();
		}
	}

	public static void drawSquare() {
		for (int i = 1; i <= 4; i++) {
			rob.move(100);
			rob.turn(90);

		}
	}

	public static void drawTriangle() {
		for (int x = 1; x <= 3; x++) {
			rob.move(100);
			rob.turn(120);
		}
	}

	public static void drawCircle() {
		for (int c = 1; c <= 360; c++) {
			rob.move(1);
			rob.turn(1);
		}
	}

}
