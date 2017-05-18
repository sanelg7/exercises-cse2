/**
 *
 * @author sanel
 */
public class Ex6_30 {
	public static void main(String[] args) {
		
		int puan = rollDice();
		int sonuc = getsonuc(puan);

		if (isNaturalOrCraps(sonuc)){
			printSonuc(sonuc);
                        System.out.println("Özel durum ile kayıp!");
                }else {
			System.out.println("Uzatmaları oynuyorsun!");
			bitenekadarRoll(sonuc);
		}
	}

	public static int rollDie() {return (int)(1 + Math.random() * 6);}
	
	public static int rollDice() {
		int die1 = rollDie();
		int die2 = rollDie();
		int top = die1 + die2;
		System.out.println("Zarlar:  " + die1 + " + " + die2 + " = " + top);
		return top;
	}
	public static int getsonuc(int puan) {
		switch (puan) {
			case 2  : 
			case 3  :
			case 12 : puan = 0; break;
			case 7  : 
			case 11 : puan = 1; break;
		}
		return puan;
	}

	public static void printSonuc(int sonuc) {
		if (sonuc == 0)
			System.out.println("Kaybettin");
		else if (sonuc == 1)
			System.out.println("Kazandın");
	}
	public static boolean isNaturalOrCraps(int sonuc) {
		return sonuc == 0 || sonuc == 1;
	}
	public static void bitenekadarRoll(int puan) {
		int sonuc;
		do {
		 	sonuc = rollDice();
		} while (sonuc != puan && sonuc != 7);
		if (sonuc == 7)
			printSonuc(0);
		else
			printSonuc(1);
	}	
}

