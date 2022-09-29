/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2.Assignment;

/**
 *
 * @author Rajendra Rakha
 */
class Barang {

    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - ((diskon * hargaDasar) / 100));
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("       PROGRAM PERHITUNGAN \n"
                + "         HARGA JUAL BARANG ");
        System.out.println("\n-----------------------------------");
        System.out.println("Kode barang  : " + kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar  : Rp. " + hargaDasar);
        System.out.println("Diskon           : " + diskon + "%");
    }
}

public class BarangMain {

    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "300LP2";
        brg1.namaBarang = "Hanphone";
        brg1.hargaDasar = 3000000;
        brg1.diskon = 15;
        int hargaJual = brg1.hitungHargaJual();
        brg1.tampilData();
        System.out.println("Harga jual      : Rp. " + hargaJual);
        System.out.println("-----------------------------------");
    }
}
