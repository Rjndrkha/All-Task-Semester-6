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

public class Pangkat {

    public int nilai, pangkat, metode;

    public int pangkatBF(int a, int n) {
        nilai =a;
        pangkat=n;
        return 0;
    }

    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);//combine 
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));//combine
            }

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        Pangkat[] png = new Pangkat[elemen];
        Pangkat metod = new Pangkat();
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan Nilai Yang akan dipanggilkan ke " + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat ke " + (i + 1) + " : ");
            png[i].pangkat = sc.nextInt();
        }
        do {
            System.out.println("=====Menu Metode Perhitungan=====");
            System.out.println("        1. Metode Brute Force");
            System.out.println("        2. Metode Divide & Conquer");
            System.out.println("        3. EXIT");
            System.out.println("===============================");
            System.out.print("Pilih Metode : ");
            metod.metode = sc.nextInt();
            if (metod.metode == 1) {
                System.out.println("=============================================================================");
                System.out.println("                    ==Hasil pangkat dengan Brute Force==");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));

                }
                System.out.println();
            } else if (metod.metode == 2) {
                System.out.println("=============================================================================");
                System.out.println("                   ==Hasil Pangkat Dengan Divide and Conquer==");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    System.out.println();
                }
                System.out.println();
                System.out.println("=============================================================================");
            } else {
                System.out.println("==TERIMAKASIH++");
            }
        } while (metod.metode > 0 && metod.metode < 3);
    }
}
