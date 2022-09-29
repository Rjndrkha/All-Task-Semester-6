
package Task;

import java.util.*;

public class Nomer4 {

    static int[] arrayA = new int[10];
    static int total = 0;
    static double rata = 0;

    public static void isi() {
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

    public static void main(String[] args) {
        System.out.println("Isi masing-masing nilai dari Mahasiswa : ");
        isi();
        rata();
        System.out.println("Rata-rata nilai seluruh Mahasiswa adalah " + rata);

    }
}
