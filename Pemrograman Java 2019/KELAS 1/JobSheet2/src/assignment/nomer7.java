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
class Cara {

    public int nilai1, nomer2, jumlah, maks;//Deklarasi variabel

    int hitung() {
        return maks = (nilai1 > nomer2) ? nilai1 : nomer2;//Operator Ternary Untuk Max
    }

    void Data() {
        Scanner sc = new Scanner(System.in);//inisialisasi utk input data.
        Cara[] nilai = new Cara[15];//pembuatan array belum memiliki data.
        Cara nilai1 = new Cara();//untuk pemanggilan array.
        System.out.print("Jumlah Mahasiswa : ");
        nilai1.jumlah = sc.nextInt();//untuk proses input data berbentuk int.
        for (int i = 0; i < nilai1.jumlah; i++) {//looping for.
            nilai[i] = new Cara();
            System.out.println("\nMahasiswa " + (i + 1));
            System.out.println();
            System.out.print("Nilai 1 : ");
            nilai[i].nilai1 = sc.nextInt();//untuk proses input data berbentuk int.
            System.out.print("Nilai 2 : ");
            nilai[i].nomer2 = sc.nextInt();//untuk proses input data berbentuk int.
            System.out.println();
        }
        for (int i = 0; i < nilai1.jumlah; i++) {//looping for.
            System.out.println("Nilai Mahasiswa " + (i + 1) + " Tertinggi : " + nilai[i].hitung());

        }
    }
}

public class nomer7 {

    public static void main(String args[]) {
        Cara Panggil = new Cara();//buat variabel data baru untuk memanggil void yang ada didalam class Cara.
        Panggil.Data();//memanggil void Data dalam class Cara.
    }
}
