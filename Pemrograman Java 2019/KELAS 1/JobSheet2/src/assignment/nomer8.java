/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Rajendra Rakha
 */
 class All {
     //variabel global 
    public int panjang, lebar, jumlah, max = 0, tanah;

    int hitungLuas() {//cara hitung luas
        return panjang * lebar;
    }

    void Data(){
        Scanner sc = new Scanner(System.in);
        All[] Luas = new All[10];//membuat array baru 
        All Luas2 = new All();
        System.out.print("Jumlah Tanah: ");
        Luas2.jumlah = sc.nextInt();
        for (int i = 0; i < Luas2.jumlah; i++) {
            Luas[i] = new All();
            System.out.println("Tanah " + (i + 1));
            System.out.println();
            System.out.print("Panjang: ");
            Luas[i].panjang = sc.nextInt();
            System.out.print("Lebar: ");
            Luas[i].lebar = sc.nextInt();
            System.out.println();

        }

        for (int i = 0; i < Luas2.jumlah; i++) {

            System.out.println("Luas Tanah " + (i + 1) + ": " + Luas[i].hitungLuas());//output hitung luas
            
        }
        
        for (int x = 0; x < Luas2.jumlah; x++) {// mencari nilai MAX program 
            if (Luas2.max < Luas[x].hitungLuas()) {
                Luas2.max = Luas[x].hitungLuas();
                Luas2.tanah = x + 1;
            }
        }
        System.out.println();
        System.out.println("Tanah Terluas : Tanah " + Luas2.tanah);

    }
}

public class nomer8{
    public static void main (String args []){
        All Panggil=new All ();
        Panggil.Data(); // memanggil Data daei class All
    }
}