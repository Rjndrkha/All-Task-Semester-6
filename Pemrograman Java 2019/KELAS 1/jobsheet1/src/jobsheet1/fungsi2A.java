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
public class fungsi2A {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1 + "," + num2);
        fibonacci(num1, num2, num3);
    }

    static void fibonacci(int num1, int num2, int num3) {
        num3 = num1 + num2;
        if (num3 > 21) {
            System.out.println();
        } else {
            System.out.print("," + num3);
            num1 = num2;
            num2 = num3;
            fibonacci(num1, num2, num3);
        }
    }
}