/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_rajendra;

/**
 *
 * @author Rajendra Rakha
 */
import java.text.SimpleDateFormat;
import java.util.*;

class DAta {

    public int[] stok, ISBN, data;
    public String[] nama, author, penerbit;
    int jumlah;
    UTS_Rajendra library = new UTS_Rajendra();

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Amount Of Data : ");
        jumlah = sc.nextInt();
        nama = new String[jumlah];
        author = new String[jumlah];
        penerbit = new String[jumlah];
        stok = new int[jumlah];
        ISBN = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nama Buku : ");
            nama[i] = sc.next();
            System.out.print("Masukkan Kode ISBN : ");
            ISBN[i] = sc.nextInt();
            System.out.print("Masukkan Nama Pemilik : ");
            author[i] = sc.next();
            System.out.print("Masukkan Nama Penerbit : ");
            penerbit[i] = sc.next();
            System.out.print("Masukkan Jumlah Stok : ");
            stok[i] = sc.nextInt();
            System.out.println();
            DataClass data = new DataClass(nama[i], ISBN[i], author[i], penerbit[i], stok[i]);
            library.totalData++;
            library.inputBookData(data);

        }
    }
    public void ShowData(int y) {

        if (stok[y] == 1) {
            System.out.println("nNama Buku : " + nama[y] + "\nKode ISBN : " + ISBN[y] + "\nAuthor : " + author[y] + "\nPenerbit : " + penerbit[y] + "\nJumlah Stok : " + stok[y]);
        } else {
            System.out.println("nNama Buku : " + nama[y] + "\nKode ISBN : " + ISBN[y] + "\nAuthor : " + author[y] + "\nPenerbit : " + penerbit[y] + "\nJumlah Stok : " + stok[y]);
        }
    }

    public void ShowALL() {
        for (int x = 0; x < nama.length; x++) {
            System.out.println("===============TAMPILKAN SEMUA DATA===================");
            ShowData(x);
            System.out.println();
            System.out.println("-------------------------------------------------------");
        }
    }
}

public class UTS_RajendraMain {

    public static void main(String args[]) {
        DAta CAll = new DAta();
        //Tanggal
        Date Tanggal = new Date();
        SimpleDateFormat tgl;
        tgl = new SimpleDateFormat("E,dd/MM/yyy hh:mm:ss a");
        System.out.println("== " + tgl.format(Tanggal) + " ==");
        //Tanggal
        UTS_Rajendra call = new UTS_Rajendra();
        int Pilih;
        System.out.println("==Welcome To My Project== ");
        System.out.println("     ==Rajendra Rakha==      ");
        System.out.println("==========================");
        System.out.println();
        System.out.println("       ==Input Data==           ");
        CAll.input();
        Scanner pilih = new Scanner(System.in);
        System.out.println("     ==PILIHAN MENU==");
        System.out.println("1.Print Book Data");
        System.out.println("2.Searching Book Data");
        System.out.println("3.Borrow Books");
        System.out.println("4.Return Books");
        System.out.println("5.EXIT");
        System.out.println("===============================");
        System.out.println();
        System.out.print("Input Pilihan Menu : ");
        Pilih = pilih.nextInt();
        switch (Pilih) {
            case 1: {
                System.out.println("Menu - 1. Print Book Data ");
                System.out.println("--------------------");
                CAll.ShowALL();
                System.out.println("Print Book Data After Sort");
                System.out.println("----------------------");
                call.printBookData();
            }
            break;
            case 2: {
                System.out.println("Menu - 2. Searching Book Data ");
                System.out.println("--------------------");
                call.searching();
            }
            break;
            case 3: {
                System.out.println("Menu - 3. Borrow Books ");
                System.out.println("--------------------------");
                call.peminjaman();
            }
            break;
            case 4: {
                System.out.println("Menu- 4. Return Books ");
                System.out.println("---------------------------");
                call.pengembalian();
            }
            break;

        }
        while (Pilih > 0 && Pilih < 5);
        System.out.println("      == " + tgl.format(Tanggal) + " ==");
        System.out.println("==========================================  ");
        System.out.println("                   THANK YOU                        ");
        System.out.println("               UTS Rajendra Rakha                  ");
        System.out.println("===========================================");
        System.out.println("                   Supervisor               ");
        for (int space = 0; space < 5; space++) {
            System.out.println();
        }
        System.out.println("       Vivin Ayu Lestari, S.Kom., M.Kom  ");
        System.out.println("    ___________________________________ ");
        System.out.println();
    }
}
