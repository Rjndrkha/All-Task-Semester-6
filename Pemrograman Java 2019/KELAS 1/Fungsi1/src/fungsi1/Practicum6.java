package fungsi1;

import java.util.*;

class Practicum6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Input Panjang : ");
        p = sc.nextInt();
        System.out.print("Input Lebar : ");
        l = sc.nextInt();
        System.out.print("Input Tinggi : ");
        t = sc.nextInt();

        L = p * l;
        System.out.println("Luas Persegi Panjang adalah : " + L);

        vol = p * l * t;
        System.out.println("Valume Balok adalah: " + vol);

    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

}
