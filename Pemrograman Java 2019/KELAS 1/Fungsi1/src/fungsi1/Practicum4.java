package fungsi1;

import java.util.*;

public class Practicum4 {

    static int Kali(int C, int D) {
        int H;
        H = (C + 10) % (D + 19);
        return H;
    }

    static int Kurang(int A, int B) {
        int X;
        A = A + 7;
        B = B + 4;
        X = Kali(A, B);
        return X;
    }

    static void minim(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.print("Angka Yang Anda Inputkan harus lebih dari 0");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        int nilai1, nilai2;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.println("Masukkan Nilai 2 : ");
        nilai2 = input.nextInt();
        minim(nilai1, nilai2);
        int hasil = Kurang(nilai1, nilai2);
        System.out.println("Hasil akhir adalah " + hasil);

    }
}
