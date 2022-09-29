/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author Rajendra Rakha
 */
public class library {

    private String title;

    private int stok;
    private String namaPeminjam;
    private int pinjamBuku;
    
    //SETTER METHOD
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public void setPinjamBuku(int pinjamBuku) {
        this.pinjamBuku = pinjamBuku;
    }

    //GETTER METHOD
    
        public String getTitle() {
        return title;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getStok() {
        return stok;
    }

    public int getPinjamBuku() {
        return pinjamBuku;
    }

    /*
     public void setTitle(String newValue) {
     title = newValue;
     }

     public void setPeminjam(String newValue) {
     namaPeminjam = newValue;
     }

     public void Stok(int newValue) {
     stok = newValue;
     }

     public void krgStok(int kurangi) {
     pinjamBuku = stok - kurangi;
     }

     public void cetakStatue() {
     System.out.println("Judul Buku: " + title);
     System.out.println("Stok Sebelumnnya: " + stok);
     System.out.println("Nama Peminjam: " + namaPeminjam);
     System.out.println("Update Stok: " + pinjamBuku);
     }
     */
}
