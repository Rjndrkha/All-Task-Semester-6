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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class MainPersewaan {

    public static void main(String[] args) {
        System.out.println("      ==WELCOME TO MY PROGRAM==");
        System.out.println("     ===PERSEWAAN KASET GAME===\n");
        System.out.println("----------- Informasi Petugas ----------");
        Petugas petugas = new Petugas(02, "Ariono Septian");
        petugas.info();

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println();

        System.out.println("Input Member Id : ");
        System.out.print(">> ");
        int id = sc.nextInt();

        System.out.println();
        System.out.print("Input Nama : \n>> ");
        String nm = sc.next();
        System.out.println();

        System.out.print("Input Jumlah Sewa : \n>>");
        int js = sc.nextInt();
        System.out.println();

        System.out.println("===Pilihan Game===");
        System.out.print("1. GTA V\n2.The Sims IV\n>> ");
        int pg = sc.nextInt();
        if (pg == 1) {

            DataGame DG = new DataGame();
            DG.setKode("G1");
            DG.setJudul("GTA V");
            DG.setJumlah(5);
            DG.setHarga(10000);
            DataPelanggan DP = new DataPelanggan();
            DP.setId(id);
            DP.setNama(nm);
            Penyewa penyewa = new Penyewa(DP, DG, petugas);
            penyewa.setHari(js);
            penyewa.info();

        } else if (pg == 2) {
            DataGame DG = new DataGame();

            DG.setKode("G2");
            DG.setJudul("The Sims IV");
            DG.setJumlah(10);
            DG.setHarga(10000);
            DataPelanggan DP = new DataPelanggan();
            DP.setId(id);
            DP.setNama(nm);
            Penyewa penyewa = new Penyewa(DP, DG, petugas);
            penyewa.setHari(js);
            penyewa.info();

        }

    }
}
