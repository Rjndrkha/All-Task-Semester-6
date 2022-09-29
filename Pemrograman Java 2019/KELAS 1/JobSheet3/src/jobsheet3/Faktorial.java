/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Faktorial {

    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {//Divide 
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);//conquer
            return fakto;//combine
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.print("Masukkan Jumlah Elemen yang telah di Hitung: ");
        int elemen = sc.nextInt();
        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan Nilai Data ke " + (i + 1) + ": ");
            fk[i].nilai = sc.nextInt();

        }
        System.out.println("================================================");
        System.out.println("Hasil Faktorial Dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("============================");

    }
}
