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
public class Petugas {

    private int idPetugas;
    private String nama;

    public Petugas() {
    }

    public Petugas(int idPetugas, String nama) {
        this.idPetugas = idPetugas;
        this.nama = nama;
    }

    public int getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("ID petugas\t\t: " + this.idPetugas);
        System.out.println("Nama Petugas\t: " + this.nama);
    }
}
