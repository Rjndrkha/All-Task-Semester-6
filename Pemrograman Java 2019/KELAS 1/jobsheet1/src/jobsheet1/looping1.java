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
public class looping1 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan Angka: ");
        angka = sc.nextInt();
        for (int a = 0; a < 5; a++) {
            angka -= 3;
        }
        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
