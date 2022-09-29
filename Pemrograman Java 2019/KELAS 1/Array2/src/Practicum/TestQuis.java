/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicum;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class TestQuis {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rata = 0, rata2 = 0, totalRata = 0,total2 = 0;
        System.out.print("Input Jumlah Mahasiswa : ");
        int MHS = sc.nextInt();
        int array[][] = new int[MHS][2];
        System.out.println("");
        System.out.println("===Input Nilai UTS Mahasiswa=== ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("");
                System.out.print("Jumlah Mahasiswa Ke [" + (i + 1) + "],[" + (j + 1) + "] ");
                System.out.print("Input Nilai Mahasiswa UTS: ");
                array[i][j] = sc.nextInt();
                 total2 = +array[i][j];
                if (array[i][j] >= 70) {
                    System.out.println("                ==Selamat Anda LULUS==      ");
                } else {
                    System.out.println("                  ==Anda Belum LULUS==       ");
                }
                System.out.println("");
                
                
                System.out.print("Input Nilai Praktikum Mahasiswa Ke [" + (i + 1) + "],[" + (j + 1) + "]: ");
                array[i][j] = sc.nextInt();
                int total = +array[i][j];
                if (array[i][j] >= 70) {
                    System.out.println("                ==Selamat Anda LULUS==      ");
                } else {
                    System.out.println("                  ==Anda Belum LULUS==       ");
                }
                
                
                
                rata = total2 / MHS;
                rata2 = total / MHS;
                totalRata = rata + rata2;

            }

        }
        System.out.println(totalRata);
       // System.out.println(rata2);
        System.out.println(total2);

    }
}
