/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2.ArrayObjects;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class PersegiPanjang {

    public int panjang;
    public int lebar;

    public static void main(String args[]) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner(System.in);

       for (int i = 0; i < 3; i++) {

            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + (i + 1));
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.println("Panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
            System.out.println();
        }

    }
}
