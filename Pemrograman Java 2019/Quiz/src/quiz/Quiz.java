/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

class Sopir {

    private String nama;
    private int biaya=150000;

    public Sopir() {
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

class Mobil {

    private String nama;
    private int biaya;

    public Mobil() {
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

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}

class Pelanggan {

    public String nama;
    private int hari;
    public Mobil mobil;
    public Sopir sopir;
    public int ktp;

    public int getKtp() {
        return ktp;
    }

    public void setKtp(int ktp) {
        this.ktp = ktp;
    }
    
            
    public Pelanggan() {
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

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public int hitungBiayaTotal() {
        Sopir s= new Sopir();
        return this.hari*100000;
    }
    
  
}

public class Quiz {
    
    
    public static void main(String[] args) {
        System.out.println("==SELAMAT DATANG DI SYSTEM PERSEWAAN MOBIL ");
        System.out.println("=============RAJENDRA RAKHA A.P===============");
        System.out.println();
        Scanner sc =new Scanner(System.in);
        
        Pelanggan data=new Pelanggan();
        
        System.out.println("==INPUT PELANGGAN==");
         System.out.println("--------------------------");
        System.out.println();
        System.out.println("Masukkan Nama Anda : ");
        System.out.print(">> ");
        String nama=sc.next();
        data.setNama(nama);
        System.out.println("--------------------------");
        System.out.println("Masukkan KTP Anda: ");
        System.out.print(">>");
        int kt=sc.nextInt();
        data.setKtp(kt);
        System.out.println("--------------------------");
        System.out.println("Masukkan Jumlah Lama Sewa");
        System.out.print(">>");
        int sw=sc.nextInt();
        data.setHari(sw);
        
        System.out.println("--------------------------");
        Mobil m = new Mobil();
        System.out.println("====Pilihan Mobil====");
        System.out.println("");
        System.out.println("1.Avanza\n2.Ayla\n3.Cayla");
        System.out.println("NB: Harga Mobil per Hari Rp100.000");
        System.out.print(">> ");
        int mb=sc.nextInt();
        
        if(mb == 1){
            m.setNama("Avanza");
            
        }else if(mb == 2){
            m.setNama("Ayla");
            
        }else{
            m.setNama("Cayla");
        }
        
        Sopir s = new Sopir();
        System.out.println("--------------------------");
        System.out.println("Apakah Anda Ingin memakai Supir ? \n1.Ya\n2.No");
        System.out.print(">> ");
        int sp=sc.nextInt();
        
        if(sp==1){
            System.out.println("Detail Supir");
            s.setNama("Agus Satrio");
            s.setBiaya(150000);
            
        }else if(sp==2){
            s.setNama("Tanpa Supir");
        }
        
        
       
        System.out.println("");
        System.out.println("=========CHECK OUT==========");
        System.out.println("Nama  : "+data.getNama());
        System.out.println("Id Ktp : "+data.getKtp());
        System.out.println("Jumlah Sewa : "+data.getHari());
        System.out.println("Mobil : "+m.getNama());
        System.out.println("Informasi Supir : "+s.getNama());
        System.out.println("Total Pembayaran Rp."+data.hitungBiayaTotal());
        System.out.println("==============================");
    }
}
