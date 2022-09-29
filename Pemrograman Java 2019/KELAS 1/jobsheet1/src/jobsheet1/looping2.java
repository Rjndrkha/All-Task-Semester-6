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
public class looping2 {
    public static void main(String args[]) {
        int saldo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Saldo: ");
        saldo = sc.nextInt();
        for (int a = 0; a < 12; a++) {
            saldo += saldo * 2 / 100;

        }
        System.out.println("Saldo Anda Adalah " + saldo);

    }
}
