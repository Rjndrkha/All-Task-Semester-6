/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet13.Assignment1Dan2;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.Scanner;

public class MainDoubleLinkedLists {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists data = new DoubleLinkedLists();
        int pilih = 0, nilai, index;

        do {
            System.out.println(" \nDOUBLE LINK LIST DENGAN MENU ");
            System.out.println("==============================");
            System.out.println("Memilih menu");
            System.out.println("1. Tambah Awal");
            System.out.println("2. Tambah Akhir");
            System.out.println("3. Tambah Data Indeks Tertentu");
            System.out.println("4. Hapus Awal");
            System.out.println("5. Hapus Akhir");
            System.out.println("6. Hapus Indeks Tertentu");
            System.out.println("7. Cetak Data");
            System.out.println("8. Cari");
            System.out.println("9. Pengurutan Data");
            System.out.println("10. Keluar");
            System.out.println("==============================");
            System.out.print(">> ");
            pilih = sc.nextInt();
            System.out.println("==============================");

            switch (pilih) {
                case 1:
                    System.out.print("\nMasukkan Data : ");
                    nilai = sc.nextInt();
                    data.addFirst(nilai);
                    break;
                case 2:
                    System.out.print("\nMasukkan Data : ");
                    nilai = sc.nextInt();
                    data.addLast(nilai);
                    break;
                case 3:
                    System.out.print("\nMasukkan Data : ");
                    nilai = sc.nextInt();
                    System.out.print("Masukkan Posisi Indeks Data : ");
                    index = sc.nextInt();
                    data.add(nilai, index);
                    break;
                case 4:
                    data.removeFirst();
                    System.out.print("\nData Berhasil Dihapus");
                    break;
                case 5:
                    data.removeLast();
                    System.out.print("\nData Berhasil Dihapus");
                    break;
                case 6:
                    System.out.print("\nMasukkan Indeks Data : ");
                    index = sc.nextInt();
                    data.remove(index);
                    break;
                case 7:
                    data.print();
                    break;
                case 8:
                    System.out.print("\nMasukkan data yang ingin dicari : ");
                    nilai = sc.nextInt();
                    data.cariKey(nilai);
                    break;
                case 9:
                    System.out.println("Data Awal : ");
                    data.print();
                    System.out.println("Data Sorting : ");
                    data.sorting();
                    data.print();
                    break;
                case 10:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Anda Salah");
            }
        } while (pilih != 10);
    }
}
