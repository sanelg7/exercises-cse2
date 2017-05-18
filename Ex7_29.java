/**
 *
 * @author sanel
 */
public class Ex7_29 {
	public static void main(String[] args) {
		int[] deste;
		do {
			deste = new int[52];
			dortKartSec(deste);	 
		} while (top(deste) != 24);
		print(deste);
	}
	public static void dortKartSec(int[] deste) {
		for (int i = 0; i < 4; i++) {
			deste[(int)(Math.random() * 52)]++;
		}
	}
	public static int top(int[] deste) {
		int top = 0;
		for (int i = 0; i < deste.length; i++) {
			top += ((i + 1) % 13) * deste[i]; 
		}
		return top;
	}
	public static void print(int[] deste) {
		String[] cesit = {"As", "2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Vale", "Kız", "Papaz"};

		System.out.print("24'ü veren kartlar: ");
		for (int i = 0; i < deste.length; i++) {
			if (deste[i] > 0)
				System.out.print(cesit[i % 13] + " ");
		}
		System.out.println();
	}
}

