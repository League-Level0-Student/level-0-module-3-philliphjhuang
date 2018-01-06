
public class checkpoint2 {
	public static void main(String[] args) {
		for (int x = 1; x <= 8; x++) {
			if (x == 1) {
				System.out.print(x + " Potato, ");
			} else if (x == 8) {
				System.out.print("more.");
			} else if (x == 4) {
				System.out.println("four.");
			} else {
				System.out.print(x + " Potatoes, ");
			}
		}
	}
}
