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
public class Main {

    public static void main(String[] args) {

        System.out.println("Pemesanan Tiket Pesawat Online");
        System.out.println("	");
        System.out.println();
        PesanTiket data = new PesanTiket();
        System.out.println();
        System.out.println("Data Pemesanan Sebelum Sorting");
        System.out.println("==============================");
        System.out.println();
        data.maskapai();

        System.out.println();

        System.out.println("Data Pemesanan Ascending Berdasarkan Harga Tiket");
        System.out.println("=================Buble_Sorting==================");
        System.out.println();
        data.bubleSort();
        data.tampil();
        System.out.println();

        System.out.println("Data Pemesanan Ascending Berdasarkan Harga Tiket");
        System.out.println("================Selection_Sort==================");
        System.out.println();
        data.selectionSort();
        data.tampil();

    }
}
