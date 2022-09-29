/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;
public class PyramidLoop {

    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int i, j, k;
        System.out.print("Input Number : ");
        int Number =sc.nextInt();
        
        for (i = 1; i <= Number; i++) {
            for (j = 50; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2 * j); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
