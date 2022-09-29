/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Number1;

/**
 *
 * @author Rajendra Rakha
 */
public class Pegawai {

    public String nip;
    public String nama, nama2;
    public String alamat;

    Pegawai() {

    }

    protected Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected void setNama1(String nama2) {
        this.nama2 = nama;
    }

    public String getNama1() {
        return nama2;
    }

    public String getNama() {
        return nama;
    }

    protected int getGaji() {
        return 5000000;
    }

    protected void tampilDataPegawai() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Gaji : " + getGaji());
    }
}
