
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String x = JOptionPane.showInputDialog("Whose birthday you want to know? (Phillip, mom, dad)");
		// 3. Print out what the user typed
		println(x);
		// 4. if user asked for "mom"
		if (x.equalsIgnoreCase("mom")) {
			// print mom's birthday
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		else if (x.equalsIgnoreCase("dad")) {
			// print dad's birthday
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		else if (x.equalsIgnoreCase("phillip")) {
			// print myBirthday
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	}

	private static void println(String x) {
		// TODO Auto-generated method stub

	}
}
