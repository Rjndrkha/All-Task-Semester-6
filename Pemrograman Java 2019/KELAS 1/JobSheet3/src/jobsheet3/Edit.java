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

public class Edit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("Program menghitung keuntungan ");
        System.out.println("======================================");
        System.out.print("Input jumlah perusahaan ");
        int comp = sc.nextInt();
        int a = 0;
        while (a <= comp) {
            System.out.println("============================================");
            System.out.println("Perusahaan Ke " + (a + 1));
            System.out.print("Input Bulan  : ");
            int totelement = sc.nextInt();
            Sum sm = new Sum(totelement);
            sm.elemen = totelement;
            System.out.println("===============================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Input keuntungan bulan Ke " + (i + 1) + " = ");
                sm.keuntungan[i] = sc.nextDouble();
            }
            System.out.println("=============================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total profitr of the company for " + sm.elemen + " month is = " + sm.totalBF(sm.keuntungan));
            System.out.println("=============================================");
            System.out.println("Algoritma Divide Conquer ");
            System.out.println("Total profitr of the company for " + sm.elemen + " month is = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
            a++;
        }

    }

}
