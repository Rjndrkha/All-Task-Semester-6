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
public class array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[4][5];
        int total = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Input Angka [" + (i + 1) + "," + (j + 1) + "] : ");
                array[i][j] = sc.nextInt();
                total += array[i][j];
            }

        }
        System.out.println("Total Keseluruhan : " + total);
    }
}
