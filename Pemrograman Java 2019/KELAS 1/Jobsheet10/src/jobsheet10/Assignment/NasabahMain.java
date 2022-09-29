/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10.Assignment;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class NasabahMain {

    public static void menu() {
        System.out.println("===================================");
        System.out.println("              OPTION MENU ");
        System.out.println("===================================");
        System.out.println("            1. Enqueue             ");
        System.out.println("            2. Dequeue             ");
        System.out.println("            3. Print               ");
        System.out.println("            4. Peek                ");
        System.out.println("            5. Peek Rear           ");
        System.out.println("            6. Peek Position       ");
        System.out.println("            7. Print Nasabah       ");
        System.out.println("            8. EXIT       ");
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan Jumlah Maksimal Antrian : ");
        int n = sc.nextInt();
        QueueNasabah qs = new QueueNasabah(n);
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("        ==Input Data Baru==  ");
                    System.out.println();
                    System.out.print("Input No.Rekening     : ");
                    String noRek = sc.next();
                    System.out.print("Input Nama Nasabah : ");
                    String nma = sc.next();
                    System.out.println();
                    qs.Enqueue(noRek, nma);
                    break;
                case 2:
                    System.out.println("Data yang dikeluarkan : ");
                    qs.Dequeue();
                    break;
                case 3:
                    qs.Print();
                    break;
                case 4:
                    qs.peek();
                    break;
                case 5:
                    qs.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan No yang dicari : ");
                    String namaCari = sc.next();
                    qs.peekPosition(namaCari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi yang dicari : ");
                    int pos = sc.nextInt();
                    qs.printNasabah(pos);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        System.out.println();
        System.out.println("=================");
        System.out.println("    THANK YOU");
        System.out.println("=================");
    }
}
