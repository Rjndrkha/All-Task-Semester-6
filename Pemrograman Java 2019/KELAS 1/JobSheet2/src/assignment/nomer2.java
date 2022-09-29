/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class nomer2 {
    //variabel global
    public int id, waktu, hargaSewa = 5000, namaGame;
    public String nama;

    int hargaPinjam() {//cara
        return waktu * hargaSewa;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);//membuat scanner baru 
        nomer2 peminjaman = new nomer2();
        do {//looping 
            System.out.println("====Selamat Datang Di Menu====");//pemilihan menu 
            System.out.println("=======Peminjaman Game=======");
            System.out.println("1.Game Mortal Kombat");
            System.out.println("2.Game The Sims 4");
            System.out.println("3.Game PUBG Online ");
            System.out.println("4.EXIT");
            System.out.print("Pilih Game Yg diinginkan: ");
            peminjaman.namaGame = sc.nextInt();//input nama game dan menyimpan
            if (peminjaman.namaGame == 1) {//jika pemilihan
                System.out.println("Pilihan Game anda Mortal Kombat");
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.waktu = sc.nextInt();
                System.out.println();
                System.out.println("========================");
                System.out.println("Nama Anda    : " + peminjaman.nama);
                System.out.println("ID Anda         : " + peminjaman.id);
                System.out.println("pilihan Game  : Mortal Kombat");
                System.out.println("Waktu Pinjam : " + peminjaman.waktu);
                System.out.println("Harga            : " + peminjaman.hargaSewa);
                System.out.println();
            } else if (peminjaman.namaGame == 2) {
                System.out.println("Pilihan Game anda The Sims 4");
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.waktu = sc.nextInt();
                System.out.println("========================");
                System.out.println("Nama Anda    : " + peminjaman.nama);
                System.out.println("ID Anda         : " + peminjaman.id);
                System.out.println("pilihan Game  : The Sims 4t");
                System.out.println("Waktu Pinjam : " + peminjaman.waktu);
                System.out.println("Harga            : " + peminjaman.hargaSewa);
                System.out.println();
            } else if (peminjaman.namaGame == 3) {
                System.out.println("Pilihan Game anda PUBG online");
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.waktu = sc.nextInt();
                System.out.println("========================");
                System.out.println("Nama Anda    : " + peminjaman.nama);
                System.out.println("ID Anda         : " + peminjaman.id);
                System.out.println("pilihan Game  : PUBG Online");
                System.out.println("Waktu Pinjam : " + peminjaman.waktu);
                System.out.println("Harga            : " + peminjaman.hargaSewa);
                System.out.println();
            } else {
                System.out.println("==TERIMA KASIH==");
            }
        } while (peminjaman.namaGame > 0 && peminjaman.namaGame < 3);
    }
}
