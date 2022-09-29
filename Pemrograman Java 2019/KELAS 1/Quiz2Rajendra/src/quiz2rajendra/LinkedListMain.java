/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2rajendra;

import java.util.Scanner;

/**
 *
 * @author Rajendra Rakha
 */
public class LinkedListMain {

    static LinkedList data = new LinkedList();
    static Scanner sc = new Scanner(System.in);
    static int x = 0, hapus = 0, size = 0;

    public static void main(String[] args) {
        System.out.println("===== Programm Online Library System =====");
        System.out.println("Nama: Rajendra Rakha A.P");
        System.out.println("Nim : 1941720080");
        System.out.println("Absen : 23");
        System.out.println("");
        boolean ulang = true;
        while (ulang) {
            System.out.println("Menu : ");
            System.out.println("1. Tambahkan Data");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Tampil Data Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan anda (1-5): ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    x++;
                    size++;
                    //data.print();
                    System.out.println();
                    System.out.println("==============================");
                    System.out.println("Data : " + x);
                    System.out.print("Masukan Nama Buku : ");
                    String nama = sc.next();
                    System.out.print("Masukan ISBN : ");
                    int pesan = sc.nextInt();
                    System.out.print("Masukan Stok :");
                    int stok = sc.nextInt();
                    System.out.println("==============================");
                    System.out.println("");
                    data.addLast(x, nama, pesan, stok);
                    break;
                case 2:
                     //belum
                case 3:
                    data.print();
                    break;
                case 4:
                    //belum
                    break;
                case 5:
                    ulang=false;
                    break;
               

                default:
                    System.out.println("inputan anda salah!!!");
                    break;
            }
        }
    }

}
