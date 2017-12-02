package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("Are you happy? (Yes or No)");
		{
			if (x.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			} else {
				String y = JOptionPane.showInputDialog("Do you want to be happy? (Yes or No)");
				if (y.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, "Change something");
				} else {
					JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
				}
			}
		}
	}
}
