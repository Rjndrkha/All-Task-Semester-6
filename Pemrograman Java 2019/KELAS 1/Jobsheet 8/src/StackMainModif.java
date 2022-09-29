/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

class Data {
    
    int n;
    stack tumpukan = new stack(10);

    public void inputan() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan jumlah isi stack: ");
        n = sc.nextInt();
        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan isi stack ke-" + (i + 1) + " : ");
            data[i] = sc.nextInt();
            tumpukan.push(data[i]);
           
        }
        System.out.println();
    }

    public void tampilData() {
        //menampilkan data yang telah diisikan//
        tumpukan.print();
    }

    public void STack() {

        //menampilkan data yang telah diisikan//
        tumpukan.print();
        //pemanggilan method pop untuk mengeluarkan sebuah data//
        tumpukan.pop();
        //cek data teratas dengan method peek//
        tumpukan.peek();
        //menampilkan kembali seluruh data//
        tumpukan.print();
    }
}

public class StackMainModif {

    public static void main(String[] args) {
        int menu;

        Data Call = new Data();
        Scanner out = new Scanner(System.in);
        Call.inputan();
        do {
            System.out.println("        ===Selamat Datang===");
            System.out.println("            ==Pilihan Menu==");
            System.out.println();
            System.out.println("1.Tampilkan Data");
            System.out.println("2.Tampilkan Data Setelah Stack");
            System.out.println("3.EXIT ");
            System.out.println("=============================");
            System.out.print("Pilih Menu : ");
            menu = out.nextInt();
            System.out.println();
            switch (menu) {
                case 1: {
                    System.out.println("==Menu Tampil Data==");
                    Call.tampilData();
                    break;
                }
                case 2: {
                    System.out.println("==Menu Tampil Data Setelah Stack==");
                    Call.STack();
                    break;
                }

            }

        } while (menu > 0 && menu < 3);

        System.out.println("==========================================  ");
        System.out.println("                   THANK YOU                        ");
        System.out.println("===========================================");
        System.out.println();
    }
}
