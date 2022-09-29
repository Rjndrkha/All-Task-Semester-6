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

public class nomer1Main {

    public static void main(String[] args) {
        nomer1Class m = new nomer1Class();
        Scanner sc = new Scanner(System.in);
        int n, n2;
        do {
            menu();
            System.out.print("Pilih Menu: ");
            n = sc.nextInt();
            try {
                switch (n) {
                    case 1:
                        System.out.println("***************************");
                        System.out.println("Masukkan Biodata Mahasiswa");
                        System.out.println("***************************");
                        System.out.print("NIM : ");
                        String nim = sc.next();
                        System.out.print("Nama : ");
                        String nama = sc.next();
                        System.out.print("Alamat : ");
                        String alamat = sc.next();
                        System.out.println("***************************");
                        m.add(nim, nama, alamat);
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Hapus Data Mahasiswa");
                        m.print();
                        System.out.println("Input NIM Mahasiswa yang ingin dihapus!");
                        System.out.print("NIM : ");
                        String delete = sc.next();
                        System.out.println();
                        System.out.println("----------------------------");
                        m.removeByValue(delete);
                        System.out.println("Data Setelah dihapus: ");
                        m.print();
                        System.out.println("----------------------------");
                        break;

                    case 3:
                        m.print();
                        System.out.println();
                        System.out.println("Apakah Anda ingin melakukan pencarian data mahasiswa? (0=tidak/1=ya)");
                        n2 = sc.nextInt();
                        if (n2 == 1) {
                            System.out.println("Masukkan NIM mahasiswa yang ingin dicari : ");
                            System.out.print("NIM : ");
                            String search = sc.next();
                            System.out.println("----------------------------");
                            m.cari(search);
                            System.out.println("----------------------------");
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (n == 1 || n == 2 || n == 3);
        System.out.println();
        System.out.println("=================");
        System.out.println("    Terimakasih ");
        System.out.println("=================");
    }
    

    public static void menu() {
        System.out.println("=========================");
        System.out.println("      DATA MAHASISWA     ");
        System.out.println("-------------------------");
        System.out.println("   1. Tambah Mahasiswa   ");
        System.out.println("   2. Hapus Mahasiswa    ");
        System.out.println("   3. Tampil mahasiswa   ");
        System.out.println("   4. Keluar             ");
        System.out.println("=========================");
    }
}
