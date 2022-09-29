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

public class Test3 {

    public static void main(String args[]) {
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == 1 || i == 5 || j == 0 || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
