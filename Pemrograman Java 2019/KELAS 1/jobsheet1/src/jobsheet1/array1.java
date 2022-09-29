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
public class array1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[15];
        for (int a = 0; a < array.length; a++) {
            System.out.print("Masukkan Nilai Array ke " + (a + 1) + ": ");
            array[a] = sc.nextInt();
        }
        System.out.println("==Genap==");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("==Ganjil==");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }

    }
}
