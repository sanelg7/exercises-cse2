
import java.util.Scanner;
/**
 *
 * @author sanel
 */
public class Ex6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
            
		long number = input.nextLong();

		System.out.println("Sayıların toplamı: " + sumDigits(number) + " dır.");
	}
		public static long sumDigits(long n) {
                if (n < 10) return n;
                return (n % 10) + sumDigits(n/10);
}

}

