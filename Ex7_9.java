
import java.util.Scanner;
/**
 *
 * @author sanel
 */
public class Ex7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] numbers = new double[5];
		System.out.print("5 sayı giriniz: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println("En küçük değer:  " + min(numbers));
	}
	public static double min(double[] array) {
		double min = array[0];
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}
}

