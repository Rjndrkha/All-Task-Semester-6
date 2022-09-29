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

public class Tugas2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Uang Yang Mau Anda Simpan : ");
        double uang = sc.nextDouble();//input uang 
        System.out.println("Uang Anda Berhasil Di input");

        System.out.println("Apakah Anda Mau melihat Perkembangan Saldo Anda Setiap Bulan ? Y/N");
        String bulan = sc.next();
        for (int a = 0; a < 5; a++) {
            if (bulan.equalsIgnoreCase("Y")) {
                System.out.println("Bank RR menyediakan Bunga 2% Setiap Bulan");
                System.out.print("Input Jumlah Perkiraan uang : ");// jumlah perkiraan uang seperti di soal
                double jumlah = sc.nextDouble();//input uang 1,5 jt
                double bunga = uang * 0.02;//RUMUS
                double total = (jumlah - uang) / bunga;
                System.out.println("Uang Anda Rp." + jumlah + " di Bulan Ke " + total);
                break;
            } else if (bulan.equalsIgnoreCase("N")) {
                System.out.println("Terimakasih");
                break;
            }
        }
    }
}
