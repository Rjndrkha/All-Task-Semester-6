/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

import java.util.*;

public class number2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] array1 = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("input Array baris ke ["+ i + "],[" + j + "] :");
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Tampilan Array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + array1[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sum = sum + array1[i][j];
            }
        }

        System.out.println("Total nilai array adalah :" + sum);
    }
}
