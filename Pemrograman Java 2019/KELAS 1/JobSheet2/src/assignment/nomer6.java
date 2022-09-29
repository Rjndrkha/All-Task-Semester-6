/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class nomer6 {
    //deklarasi variabel global 
    public int panjang, lebar, jumlah;

    int hitungLuas() {//cara
        return panjang * lebar;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);//membuat Scanner baru
        nomer6[] Luas = new nomer6[10];//membuat array baru 
        nomer6 Luas2 = new nomer6();
        System.out.print("Jumlah Tanah: ");
        Luas2.jumlah = sc.nextInt();//input dan menyimpan di vaariabel jumlah 
        for (int i = 0; i < Luas2.jumlah; i++) {
            Luas[i] = new nomer6();
            System.out.println("Tanah " + (i + 1));
            System.out.println();
            System.out.print("Panjang: ");
            Luas[i].panjang = sc.nextInt();
            System.out.print("Lebar: ");
            Luas[i].lebar = sc.nextInt();
            System.out.println();
        }
        for (int i = 0; i < Luas2.jumlah; i++) {//looping output
            System.out.println("Luas Tanah " + (i + 1) + ": " + Luas[i].hitungLuas());

        }
    }
}
