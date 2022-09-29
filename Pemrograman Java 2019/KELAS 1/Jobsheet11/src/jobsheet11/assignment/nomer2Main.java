/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11.assignment;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class nomer2Main {

    public static void menu() {
        System.out.println("========================");
        System.out.println("       MENU UTAMA       ");
        System.out.println("------------------------");
        System.out.println("     1. Tambah Barang   ");
        System.out.println("     2. Hapus Barang    ");
        System.out.println("     3. Pencarian       ");
        System.out.println("     4. Keluar          ");
        System.out.println("========================");
    }

    public static void menuTampil() {
        System.out.println("========================");
        System.out.println("       MENU HAPUS");
        System.out.println("------------------------");
        System.out.println(" 1. Hapus Data");
        System.out.println(" 2. Kembali ke Menu     ");
        System.out.println("========================");
    }

    public static void menuCari() {
        System.out.println("========================");
        System.out.println("     MENU PENCARIAN     ");
        System.out.println("------------------------");
        System.out.println("     1. Cari Barang     ");
        System.out.println("     2. Cari Urutan     ");
        System.out.println("     3. Kembali ke Menu ");
        System.out.println("========================");
    }

    public static void main(String[] args) {
        nomer2Class p = new nomer2Class();
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            menu();
            System.out.print("Menu yang Anda pilih : ");
            pilih = sc.nextInt();
            try {
                int pilihTampil;
                int pilihCari;
                switch (pilih) {
                    case 1:
                        System.out.println("-----------------------");
                        System.out.print("Nama Barang : ");
                        String nama = sc.next();
                        System.out.print("Jenis Barang : ");
                        String jenis = sc.next();
                        p.add(nama, jenis);
                        break;
                    case 2:
                        do {
                            menuTampil();
                            System.out.print("Pilih menu : ");
                            pilihTampil = sc.nextInt();
                            switch (pilihTampil) {
                                case 1:
                                    p.print();
                                    System.out.print("Masukkan Nama = ");
                                    String namaa = sc.next();
                                    p.removeByValue(namaa);
                                    System.out.println("Data Setelah Dihapus");
                                    p.print();
                                    break;
                                case 2:
                                    break;

                            }
                        } while (pilihTampil == 1);
                        break;
                    case 3:
                        do {
                            menuCari();
                            System.out.print("Pilih menu : ");
                            pilihCari = sc.nextInt();
                            switch (pilihCari) {
                                case 1:
                                    System.out.println("-----------------------");
                                    System.out.print("Nama Barang : ");
                                    String carii = sc.next();
                                    p.cari(carii);
                                    break;
                                case 2:
                                    System.out.println("-----------------------");
                                    System.out.print("Masukkan urutan : ");
                                    int urutan = sc.nextInt();
                                    p.searchindex(urutan);
                                    break;
                                case 3:
                                    break;
                            }
                        } while (pilihCari == 1 || pilihCari == 2);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}
