/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author Rajendra Rakha
 */
public class BarangMain {

    public static void main(String args[]) {
        Barang bl = new Barang();
        bl.namaBarang = "Corsair 2 GB";
        bl.jenisBarang = "DDR";
        bl.hargaSatuan = 250000;
        bl.stok = 10;
        bl.tambahStok(1);
        bl.kurangiStok(3);
        bl.tampilBarang();
        int hargaTotal = bl.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = " + hargaTotal);
        System.out.println();
        Barang b2 = new Barang("Logitech", "Wireless Mouse ", 150000, 25);
        b2.tampilBarang();

    }
}
