
package Task;

import java.util.*;

public class Nomer5 {

    static int[] arrayA = new int[10];
    static int total = 0, terbesar = 0, terkecil = 10000;
    static double rata = 0;

    public static void nilai() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrayA[i] = input.nextInt();
        }
    }

    public static void rata() {
        for (int i = 0; i < 10; i++) {
            total += arrayA[i];
        }
        rata = total / 10;
    }

    public static void terbesar() {
        for (int i = 0; i < 10; i++) {
            if (arrayA[i] > terbesar) {
                terbesar = arrayA[i];
            }
        }
    }

    public static void terkecil() {
        for (int i = 0; i < 10; i++) {
            if (arrayA[i] < terkecil) {
                terkecil = arrayA[i];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Isilah masing-masing nilai dari mahasiswa : ");
        nilai();
        rata();
        System.out.println("Rata - rata nilai seluruh mahasiswa adalah : " + rata);
        terbesar();
        terkecil();
        System.out.println("Nilai terbesar dari seluruh mahasiswa adalah :" + terbesar);
        System.out.println("Nilai terkecil dari seluruh mahasiswa adalah :" + terkecil);

    }
}
