/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3;

/**
 *
 * @author Rajendra Rakha
 */
public class Anggota {

    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota(String nama,String alamat){
        this.nama=nama;
        this.alamat=alamat;
        this.simpanan=0;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }

}

class koperasiDemo {

    public static void main(String[] args) {
        Anggota call = new Anggota("Iwan","jalan Mawar");
      
        System.out.println("Simpanan " + call.getNama() + ": Rp " + call.getSimpanan());
        System.out.println();
        
        call.setNama("Rajendra Rakha");
        call.setAlamat("Jalan Sawojajar no 13");
        call.setor(100000);
        System.out.println("Simpanan " + call.getNama() + " : Rp " + call.getSimpanan());

        call.pinjam(5000);
        System.out.println("Simpanan " + call.getNama() + ": Rp " + call.getSimpanan());

    }
}
