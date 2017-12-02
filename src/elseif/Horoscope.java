package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("What is your zodiac sign?");
		if (x.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null,
					"As Uranus ends its time in opposition with Mars today you notice someone close to you needs a lift.");
		} else if (x.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null,
					"As The Moon leaves your house today others will be interested in your ideas, but you have to be clear.");
		} else if (x.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null,
					"It could be confusing today when your feelings and thoughts swing wildly, but try to learn from it.");
		} else if (x.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null,
					"Be careful how you offer help in a situation today, be sensitive to the issue and you can solve it.");
		} else if (x.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null,
					"Ask for advice today if your financial headache continues, and accept that this could take time.");
		} else if (x.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null,
					"When you and your partner appear to be heading in different directions today, compromise is needed.");
		} else if (x.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null,
					"As Mars ends its time in opposition with Uranus today you should accept your partner for who they are.");
		} else if (x.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null,
					"Your family and relationships are important today, but you may be frustrated at the slow pace of something.");
		} else if (x.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null,
					"Energy from The Sun square with Neptune today means you can stand up for yourself and what you want.");
		} else if (x.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null,
					"Bring your inner child out today and strive for a simpler way of looking at the world.");
		} else if (x.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null,
					"Today someone will reveal their true colours, but others wont want to hear about it yet.");
		} else if (x.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null,
					"Energy from Neptune square with The Sun today will put you in a good position to ask the universe for what you want.");
		} else {
			JOptionPane.showMessageDialog(null, "That is not a star sign.");
		}
	}
}