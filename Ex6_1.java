/**
 *
 * @author sanel
 */
public class Ex6_1 {
    
	public static void main(String[] args) {
		int allpentagonal = 100;
		int nperline = 10;
		System.out.println("İlk 100 pentagonal sayı; ");
		for (int i = 1; i <= allpentagonal; i++) {
			if (i % nperline == 0) 
				System.out.printf("%7d\n", getPentagonal(i));
			else
				System.out.printf("%7d", getPentagonal(i));
		}
	}

	public static int getPentagonal(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}