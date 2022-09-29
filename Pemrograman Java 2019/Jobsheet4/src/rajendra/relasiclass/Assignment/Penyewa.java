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
public class Penyewa {

    private DataPelanggan pelanggan;
    private DataGame game;
    private Petugas petugas;
    private int hari;

    public Penyewa() {
    }

    public Penyewa(DataPelanggan siswa, DataGame dg, Petugas petugas) {
        this.pelanggan = siswa;
        this.game = dg;
        this.petugas = petugas;
    }

    public DataPelanggan getSiswa() {
        return pelanggan;
    }

    public void setpelanggan(DataPelanggan siswa) {
        this.pelanggan = siswa;
    }

    public DataGame getBuku() {
        return game;
    }

    public void setBuku(DataGame buku) {
        this.game = buku;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public void info() {

        System.out.println("--------- Informasi Penyewa ---------");
        this.pelanggan.info();
        System.out.println("-------------------------------------");
        System.out.println("----------- Detail Pinjaman ----------");
        System.out.println("");
        if (this.game.getJumlah() > 0) {
            this.game.info();
            System.out.println("Jumlah Hari Sewa\t: " + this.hari + " hari");
        } else {
            System.out.println("Jumlah buku sewa tidak boleh kosong");
        }
        System.out.println("-------------------------------------");

    }
}
