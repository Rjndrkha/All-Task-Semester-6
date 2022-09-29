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

public class No2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int i, j, maksimum, cari;
        System.out.print("Input Baris : ");
        int B = sc.nextInt();
        System.out.print("Input Kolom : ");
        int K = sc.nextInt();

        int array[][] = new int[B][K];

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[0].length; j++) {
                System.out.print("Input Baris Ke [" + (i + 1) + "][" + (j + 1) + "]: ");
                array[i][j] = sc.nextInt();
               // maksimum = array[i][j];
                
               
            }
        }
        
        
       
    }
}
