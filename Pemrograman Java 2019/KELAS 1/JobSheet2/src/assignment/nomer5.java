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

public class nomer5 {
        //deklarasi global
    public int tinggi, sisi;
    public int panjang;

    int hitunLuas() {//cara
        return panjang * tinggi;
    }

    int hitungKeliling() {//cara
        return (2 * panjang) + (2 * sisi);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);//membuat scanner baru

        nomer5[] Cara = new nomer5[5];//membuat array 

        for (int i = 0; i < Cara.length; i++) {
            Cara[i] = new nomer5();
            System.out.print("Input Panjang Ke " + (i + 1) + " : ");
            Cara[i].panjang = sc.nextInt();//input dan menyimpan data di varabel
            System.out.print("Input Tinggi: " + (i + 1) + " : ");
            Cara[i].tinggi = sc.nextInt();
            System.out.print("Input Sisi Miring: " + (i + 1) + " : ");
            Cara[i].sisi = sc.nextInt();
            System.out.println();
        
        }
        for (int i = 0; i < Cara.length; i++) {//looping untuk output s
            System.out.println("==========================================");
            System.out.println("Luas Jajar Genjang Ke " + (i + 1) + " Adalah : " + Cara[i].hitunLuas());
            System.out.println();
            System.out.println("Keliling Jajar Genjang Ke " + (i + 1) + " Adalah : " + Cara[i].hitungKeliling());
            System.out.println("==========================================");
            System.out.println();
        }

    }

}
