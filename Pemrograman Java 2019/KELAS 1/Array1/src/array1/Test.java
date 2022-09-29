/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Baris :  ");
        int B = sc.nextInt();
        System.out.print("Input Kolom :  ");
        int K = sc.nextInt();

        String array2[][] = new String[B][K];
        String bintang = "*";

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j] = "*";
                if (i == 0 || i == array2.length - 1 || j == 0 || j == array2[0].length - 1 || i == j) {
                    array2[i][j] = "*";
                    System.out.print(array2[i][j]);

                } else {
                    array2[i][j] = " ";
                    System.out.print(array2[i][j]);
                }
            }
            System.out.println("");
        }

    }
}
