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
public class MAIN {

    public static void main(String[] args) {
        System.out.println("======WELCOME======");
        System.out.println("----Rajendra Rakha-----");
        System.out.println("");

        System.out.println("Daftar Gaji Yang Tersedia");
        System.out.println("--------------=---------");
        DaftarGaji dg = new DaftarGaji();
        dg.printSemuaGaji();
        System.out.println();

        System.out.println("------Data Pegawai------");
        Pegawai p = new Pegawai();
        p.nip = "1941720080";
        p.nama = "Rajendra Rakha";
        p.alamat = "Sawojajar";
        p.getGaji();

        p.tampilDataPegawai();
        System.out.println();

        System.out.println("-----Data Dosen-----");
        Dosen d = new Dosen();
        d.nip = "194172000";
        d.setNama("Ariono Septian");
        d.alamat = "Turen";
        d.jumlahSKS = 5;
        d.TARIF_SKS = 200000;
        d.getGaji();
        d.tampilDataDosen();
    }
}
