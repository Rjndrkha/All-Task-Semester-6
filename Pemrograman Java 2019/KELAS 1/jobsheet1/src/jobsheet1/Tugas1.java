/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class Tugas1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int a = 0; a < 5; a++) {
            //Menu Paket Makanan
            System.out.println("====Menu====");
            System.out.println("1.Paket Chicken");
            System.out.println("2.Paket Oke ");
            System.out.println("3.EXIT");
            System.out.print("Pilih Paket Anda : ");
            int pilihan = sc.nextInt();
            //Pemilihan Paket
            if (pilihan == 1) {

                System.out.println("+Pilihan Paket+");
                System.out.println("Chicken A (Rp. 12.000)");
                System.out.println("Chicken B (Rp. 15.000)");
                System.out.println("Chicken C (Rp. 20.000)");
                System.out.println("+Pilih Paket Yang anda Mau :");
                String pilihan2 = sc.next();

                if (pilihan2.equalsIgnoreCase("A")) {
                    System.out.print("Mau Beli Berapa?: ");
                    int beli = sc.nextInt();
                    int asd = 12000 * beli;//RUMUS
                    System.out.println("Anda Harus membayar Rp." + asd);

                } else if (pilihan2.equalsIgnoreCase("B")) {
                    System.out.print("Mau Beli Berapa?: ");
                    int beli = sc.nextInt();
                    int hrg2 = 15000 * beli;
                    System.out.println("Anda Harus Membayar Rp." + hrg2);

                } else if (pilihan2.equalsIgnoreCase("C")) {
                    System.out.print("Mau Beli Berapa?: ");
                    int beli = sc.nextInt();
                    int hrg3 = 20000 * beli;
                    System.out.println("Anda Harus membayar Rp." + hrg3);
                } else {
                    System.out.println("Pilihan Salah");
                }

            } else if (pilihan == 2) {

                System.out.println("+Pilihan Paket+");
                System.out.println("Oke A (Rp. 10.000)");
                System.out.println("Oke B (Rp. 12.000)");
                System.out.println("Oke C (Rp. 15.000)");
                System.out.println("+Pilih Paket Yang anda Mau :");
                String pilihan4 = sc.next();

                if (pilihan4.equalsIgnoreCase("A")) {
                    System.out.print("Mau Beli Berapa?: ");
                    int beli = sc.nextInt();
                    int asd = 10000 * beli;//RUMUS
                    System.out.println("Anda Harus membayar Rp." + asd);

                } else if (pilihan4.equalsIgnoreCase("B")) {
                    System.out.print("Mau Beli Berapa?: ");
                    int beli = sc.nextInt();
                    int hrg2 = 12000 * beli;
                    System.out.println("Anda Harus Membayar Rp." + hrg2);

                } else if (pilihan4.equalsIgnoreCase("C")) {
                    System.out.print("Mau Beli Berapa?: ");
                    int beli = sc.nextInt();
                    int hrg3 = 15000 * beli;
                    System.out.println("Anda Harus membayar Rp." + hrg3);
                } else {
                    System.out.println("Pilihan Salah");
                }
            } else if (pilihan == 3) {
                System.out.println("Terima Kasih");
                break;
            }
        }
    }
}
