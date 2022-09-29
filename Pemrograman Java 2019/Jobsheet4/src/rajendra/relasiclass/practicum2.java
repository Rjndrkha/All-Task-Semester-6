/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajendra.relasiclass;

/**
 *
 * @author Rajendra Rakha
 */
class mobil {

    private String nama;
    private int biaya;

    mobil() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungbiaya(int hari) {
        return biaya * hari;
    }

}

class sopir {

    private String nama;
    private int biaya;

    sopir() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }

}

class pelanggan{
    private String nama;
    private int hari;
    
    private mobil mobil;
    private sopir sopir;
    
    public pelanggan(){
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public mobil getMobil() {
        return mobil;
    }

    public void setMobil(mobil mobil) {
        this.mobil = mobil;
    }

    public sopir getSopir() {
        return sopir;
    }

    public void setSopir(sopir sopir) {
        this.sopir = sopir;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungbiaya(hari)+sopir.hitungBiayaSopir(hari);
    }
}


public class practicum2{
    public static void main(String[] args) {
        mobil m =new mobil();
        m.setNama("Avanza");
        m.setBiaya(35000);
        
        sopir s=new sopir();
        s.setNama("Paijo");
        s.setBiaya(200000);
        
        pelanggan p =new pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        
      
        System.out.println("Pelanggan   = " +p.getNama());
        System.out.println("Biaya Total  = " +p.hitungBiayaTotal());
        System.out.println("Mobil Anda  = " +p.getMobil().getNama());
        System.out.println("Sopir Anda  = " +p.getSopir().getNama());
        
    }
}
