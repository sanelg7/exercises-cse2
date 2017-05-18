
/**
 *
 * @author sanel
 */
public class Ex6_32 {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 20000; i++) {
            if (crapsOyna() == 1) {
                count++;
            }
        }
        System.out.println("Toplam oynanan craps sayısı: " + count);
        System.out.println("*****************************************");

    }

    public static int crapsOyna() {
        int zar1 = zarAt();
        int zar2 = zarAt();
        printSayı(zar1, zar2);
        int puan = checkTop(zar1, zar2);
        if (puan <= 1) {
            printSonuc(puan);
            return puan;
        }
        int top;
        do {
            zar1 = zarAt();
            zar2 = zarAt();
            top = zar1 + zar2;
        } while (top != puan && top != 7);
        printSayı(zar1, zar2);
        if (top == 7) {
            printSonuc(0);
            puan = 0;
            System.out.println("Fena kaybettin");
        } else {
            printSonuc(1);
            puan = 1;
        }
        return puan;
    }

    public static int zarAt() {
        return (int) (1 + Math.random() * 6);
    }

    public static int checkTop(int zar1, int zar2) {
        int top = zar1 + zar2;
        switch (top) {
            case 2:
            case 3:
            case 12:
                return 0;
            case 7:
            case 11:
                return 1;
        }
        return top;
    }

    public static void printSonuc(int sonuc) {

        int kazan = 0;
        int kaybet = 0;
        if (sonuc == 0) {

            System.out.println("Kaybettin");
            kazan++;
        } else {

            System.out.println("Kazandın");
            kaybet++;

        }

        System.out.println("Toplam " + kazan + " kez kazanıldı.");
        System.out.println("Toplam " + kaybet + " kez kaybedildi.");
    }

    public static void printSayı(int zar1, int zar2) {
        System.out.println(
                "Attığınız zar:  " + zar1 + " + " + zar2 + " = " + (zar1 + zar2));
    }
}
