/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Quiz1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Jumlah: ");
        int input = sc.nextInt();
        
        for (int i = 1; i <= input; i++) {
            for (int j = i; j <= input; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i * 2 - 2; k++) {
                System.out.print(" ");
            }
            for (int l = i; l <= input; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
