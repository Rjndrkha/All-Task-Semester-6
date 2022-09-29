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
public class Selection2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int y;
        System.out.print("Input Number: ");
        y = sc.nextInt();
        if ((y % 2 == 0) && (y % 6 != 0) && (y % 15 != 0)) {
            System.out.println("Bilangan Kelipatan 2");
        } else {

        }
        if ((y % 6 == 0) && (y % 15 != 0)) {
            System.out.println("Bilangan Kelipatan 6");
        } else {

        }
        if ((y % 15 == 0)) {
            System.out.println("Bilangan Kelipatan 15");

        } else {
            System.out.println("Bilangan Bukan Kelipatan 2,6,15");
        }
    }
}
