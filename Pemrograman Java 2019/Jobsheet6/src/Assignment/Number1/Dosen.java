/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Number1;

import Assignment.Number1.Pegawai;

/**
 *
 * @author Rajendra Rakha
 */
public class Dosen extends Pegawai {

    public int jumlahSKS;
    public int TARIF_SKS;

    Dosen() {

    }

    protected Dosen(String nip, String nama, String alamat, int jumlahSKS, int TARIF_SKS) {
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.TARIF_SKS = TARIF_SKS;
    }

    protected void setSKS(int SKS) {
        this.jumlahSKS = SKS;
    }

    protected int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }

    protected void setNama1(String nama) {
        this.nama = nama;
    }

    protected void tampilDataDosen() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jumlah SKS : " + jumlahSKS);
        System.out.println("Tarif SKS : " + TARIF_SKS);
        System.out.println("Total Gaji : " + getGaji());

    }
}
