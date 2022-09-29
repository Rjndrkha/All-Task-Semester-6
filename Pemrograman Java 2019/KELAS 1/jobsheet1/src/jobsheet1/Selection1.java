/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

import java.util.Scanner;

/**
 *
 * @author Rajendra Rakha
 */
public class Selection1 {
     public static void main(String args[]) {
        int total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai Tugas(0-100): ");
        int nilai1 = sc.nextInt();
        System.out.print("Masukkan Nilai UTS(0-100): ");
        int nilai2 = sc.nextInt();
        System.out.print("Masuukan Nilai UAS(0-100): ");
        int nilai3 = sc.nextInt();
        if (nilai1 > 0 && nilai1 < 100 && nilai2 > 0 && nilai2 < 100 && nilai3 > 0 && nilai3 < 100) {

            total = (nilai1 * 20 / 100 + nilai2 * 35 / 100 + nilai3 * 45 / 100);
            System.out.println("Hasil Akhir Anda " + total);
        } else {
            System.out.println("Input Salah");
        }
    }
}


