/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swalayan.model;

/**
 *
 * @author Rimuru
 */
public class Penjualan1 {
    public int idPenjualan, idKaryawan, idMember, idBarang, jumlahBarang, totalHarga;
    public String tanggal;

    public Penjualan1() {
    }

    public Penjualan1(int idPenjualan, int idKaryawan, int idMember, int idBarang, int jumlahBarang, int totalHarga, String tanggal) {
        this.idPenjualan = idPenjualan;
        this.idKaryawan = idKaryawan;
        this.idMember = idMember;
        this.idBarang = idBarang;
        this.jumlahBarang = jumlahBarang;
        this.totalHarga = totalHarga;
        this.tanggal = tanggal;
    }

    public int getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(int idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
   
}
