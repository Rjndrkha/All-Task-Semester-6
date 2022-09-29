/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3.Task;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class nomer6 {

    public String namaMHS[];
    public int jumlah;
    public double rata[];
    public double nilaiTengah;

    public nomer6(int jumlah) {//membuat parameter
        //Kata kunci this digunakan sebagai referensi dari class itu sendiri.
        this.namaMHS = new String[jumlah];
        this.nilaiTengah = 0;
        this.rata = new double[jumlah];
        this.jumlah = jumlah;
    }

     double rataDC(double arr[], int a, int b) {//rumus DC
        if (a == b) {
            return arr[1];
        } else if (a < b) {
            int nilaiTengah = (a + b) / 2;
            double nilaiA = rataDC(arr, a, nilaiTengah - 1);
            double nilaiB = rataDC(arr, nilaiTengah + 1, b);
            return (nilaiA + nilaiB + arr[nilaiTengah]) / arr.length;

        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner angka = new Scanner(System.in);//Scanner inputan baru
        Scanner huruf = new Scanner(System.in);

        System.out.println("===Program Perhitungan Rata Rata===");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int n = angka.nextInt();
        //looping dan input output 
        nomer6 arr = new nomer6(n);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nama Mahasiswa " + (i + 1) + " : ");
            arr.namaMHS[i] = huruf.next();
            System.out.print("Masukkan Nilai : ");
            arr.rata[i] = angka.nextInt();

        }
        for (int i = 0; i < arr.jumlah; i++) {
            System.out.println("Nilai " + arr.namaMHS[i] + " : " + arr.rata[i]);
        }
        System.out.println();
        System.out.println("Rata Rata Nilai Mahasiswa : " + String.format("%.2f", arr.rataDC(arr.rata, 0, arr.jumlah)));//memunculkan 2 angka dblkg koma 
                        //dan call rumus DC
    }
}
