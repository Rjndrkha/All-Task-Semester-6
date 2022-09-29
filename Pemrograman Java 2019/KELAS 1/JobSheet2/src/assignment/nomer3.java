/*
 * To change this l{icense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

/**
 *
 * @author Rajendra Rakha
 */
class Barang {

    Scanner input = new Scanner(System.in);//inisialisasi utk input data
    String name;//Deklarasi variabel
    int hargasatuan, jumlah, total, total1;//Deklarasi variabel
    float diskon;//Deklarasi variabel

    int hitungHargaTotal() {
        System.out.print("Masukkan Nama Barang  : ");
        name = input.next();//proses input huruf dengan String
        System.out.print("Masukkan Harga Barang : Rp. ");
        hargasatuan = input.nextInt();//proses input angka dengan Integer
        System.out.print("Masukkan Total Barang : ");
        jumlah = input.nextInt();//proses input angka dengan Integer
        total = jumlah * hargasatuan;//rumus yang digunakan.
        System.out.println();
        System.out.println("\t\t======Rincian======     ");
        System.out.println("Nama Barang            : " + name);
        System.out.println("Harga Barang            : " + hargasatuan);
        System.out.println("Total Barang             : " + jumlah);
        System.out.println("Total Harus Dibayar   : Rp. " + total);
        return 0;
    }

    int hitungDiskon() {
        if (total >= 100000) {
            System.out.println("Mendapat diskon 10%");
            diskon = (int) (total * 0.10);//rumus yang digunakan.
        } else if (total >= 50000) {
            System.out.println("Mendapat 5%");
            diskon = (int) (total * 0.5);//rumus yang digunakan.
        } else {
            System.out.println("Tidak Mendapat Diskon");
        }
        return 0;
    }

    int hitungHargaBayar() {
        total1 = (int) (total - diskon);//rumus yang digunakan.
        System.out.println("Total Yang Harus Anda Bayar Setelah Dikurangi Diskon : Rp. " + total1);
        return 0;
    }
}

public class nomer3 {

    public static void main(String[] args) {
        Barang Data = new Barang();//membuat variabel baru bernama Data. untuk memanggil variabel global yang masih bagian dalam class Barang.
        Data.hitungHargaTotal();
        Data.hitungDiskon();
        Data.hitungHargaBayar();
    }
}
