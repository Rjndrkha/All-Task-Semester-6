/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajendra.relasiclass.Assignment;

/**
 *
 * @author Rajendra Rakha
 */
public class DataGame {

    private String kode, nama;
    private int jumlah, harga;

    public DataGame() {
    }

    public DataGame(String kode, String judul, int jumlah, int harga) {
        this.kode = kode;
        this.nama = judul;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return nama;
    }

    public void setJudul(String judul) {
        this.nama = judul;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void info() {

        System.out.println("Judul Game\t\t: " + this.nama);
        System.out.println("Kode Game\t\t: " + this.kode);
        System.out.println("Stok\t\t: " + this.jumlah);
        System.out.println("Harga Sewa\t\t: " + this.harga);
    }
}
