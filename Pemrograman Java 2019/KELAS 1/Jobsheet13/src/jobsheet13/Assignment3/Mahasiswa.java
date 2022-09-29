/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet13.Assignment3;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.Scanner;

public class Mahasiswa {

    String nama;
    int nilai;

    public Mahasiswa(String nama, int nilai) {
        nama = nama;
        nilai = nilai;
    }

    Mahasiswa() {

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists2 data = new DoubleLinkedLists2();
        int pilih = 0, index;
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
            System.out.println("9. Pengurutan Data Ascending");
            System.out.println("10.Pengurutan Data Descending");
            System.out.println("11.Pengurutan secara TRAVERSE INORDER");
            System.out.println("12. Keluar");
            System.out.println("==============================");
            System.out.print(">> ");
            pilih = sc.nextInt();
            System.out.println("==============================");

            switch (pilih) {
                case 1:
                    Mahasiswa addFirst = new Mahasiswa();
                    System.out.print("\nMasukkan Nama  : ");
                    addFirst.nama = sc.next();
                    System.out.print("Masukkan Nilai : ");
                    addFirst.nilai = sc.nextInt();
                    data.addFirst(addFirst);
                    break;
                case 2:
                    Mahasiswa addLast = new Mahasiswa();
                    System.out.print("\nMasukkan Nama  : ");
                    addLast.nama = sc.next();
                    System.out.print("Masukkan Nilai : ");
                    addLast.nilai = sc.nextInt();
                    data.addLast(addLast);
                    break;
                case 3:
                    Mahasiswa addIndex = new Mahasiswa();
                    System.out.print("\nMasukkan Nama  : ");
                    addIndex.nama = sc.next();
                    System.out.print("Masukkan Nilai : ");
                    addIndex.nilai = sc.nextInt();
                    System.out.print("Masukkan Indeks data : ");
                    index = sc.nextInt();
                    data.add(addIndex, index);
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
                    Mahasiswa get = new Mahasiswa();
                    System.out.print("\nMasukkan Nama  : ");
                    get.nama = sc.next();
                    System.out.print("Masukkan Nilai : ");
                    get.nilai = sc.nextInt();
                    System.out.println("Data" + "\nNama : " + get.nama + "\nNilai : " + get.nilai);
                    System.out.println("=[Ditemukan pada indeks ke : " + data.getKey(get) + " ]=");
                    break;
                case 9:
                    System.out.println("Data Awal : ");
                    data.print();
                    System.out.println("\nData Ascending : ");
                    data.bubbleSortAscending();
                    data.print();
                    break;
                case 10:
                    System.out.println("Data Awal : ");
                    data.print();
                    System.out.println("\nData Descending : ");
                    data.bubbleSortDescending();
                    data.print();
                    break;
                case 11:
                    data.traverseInOrder(data.head);
                    data.print();
                    break;
                case 12:
                   System.out.println("Terimakasih");
                    //System.exit(0); 
                default:
                    System.out.println("Pilihan Anda Salah");
            }
        } while (pilih != 11);
    }
}
