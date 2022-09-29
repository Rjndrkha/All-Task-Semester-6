/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Test2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int total = 0,total2=0;
        
        System.out.print("Input Baris :  ");
        int B = sc.nextInt();
        System.out.print("Input Kolom :  ");
        int K = sc.nextInt();
        
        int array[][] = new int[B][K];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Masukkan array [" + i + "," + j + "] : ");
                array[i][j] = sc.nextInt();
                total += array[i][j];
            }
        }
        System.out.println("MATRIX A");
        for (int muncul[] : array) {
            for (int k : muncul) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
        System.out.println("------------------------------------------------");
        System.out.print("Input Baris :  ");
        int L = sc.nextInt();
        System.out.print("Input Kolom :  ");
        int M = sc.nextInt();
        int array2 [][]=new int [L][M];
        
        for (int k = 0; k < array2.length; k++) {
            for (int l = 0; l < array2[0].length; l++) {
                System.out.print("Masukkan array [" + k + "," + l + "] : ");
                array[k][l] = sc.nextInt();
                total2 += array[k][l];
            }
        }
        System.out.println("MATRIX B");
        System.out.println("Total Semuanya Adalah : " + total2);
        //SALAh
        double Multiply = (double) total+(array.length * array[0].length);
        System.out.println("Hasil Perkalian : " + Multiply);
    }
}
