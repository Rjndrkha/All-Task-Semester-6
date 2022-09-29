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
import java.util.*;

public class Koperasi {

    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Koperasi(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void setLimitPinjaman(int limitPinjaman) {
        this.limitPinjaman = limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman) {
        if (jumlahPinjaman > this.limitPinjaman) {
            System.out.println("Maaf, Jumlah peminjaman lebihi limit");
        } else {
            this.jumlahPinjaman = jumlahPinjaman;
        }

    }

    public void angsur(int angsur) {
        int minAngsur = (10 * this.jumlahPinjaman) / 100;
        if (angsur < minAngsur) {
            System.out.println("Maaf,Angsuran Harus minimal 10% dari jumlah"
                    + " pinjaman saat ini");
        } else {
            this.jumlahPinjaman = this.jumlahPinjaman - angsur;
        }
        this.jumlahPinjaman = this.jumlahPinjaman - angsur;
    }

}

class TestKoperasi {

    public static void main(String[] args) {
        String nm = null;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 999; i++) {

            System.out.println("==INPUT NAMA MEMBER==");
            System.out.print(">>");
            nm = input.next();
            if (nm.equalsIgnoreCase("donny")) {
                System.out.println("Welcome Donny");
                System.out.println();
                break;
            } else {
                System.out.println("==MEMBER NOT FOUND==");
                return;
            }
        }

        Koperasi donny = new Koperasi("111333444", nm, 5000000);
        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit peminjaman : " + donny.getLimitPinjaman());

        int pinjam;
        System.out.print("Masukkan pinjaman : ");
        pinjam = input.nextInt();
        donny.pinjam(pinjam);

        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());

        int angsur;
        System.out.print("Masukkan Angsuran : ");
        angsur = input.nextInt();
        donny.angsur(angsur);

        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());

    }
}
