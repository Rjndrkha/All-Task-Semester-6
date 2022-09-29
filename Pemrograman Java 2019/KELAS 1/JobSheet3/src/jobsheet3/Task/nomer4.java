/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3.Task;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

public class nomer4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // prioses input 
        System.out.println("==Pemilihan Presiden BEM Tahun 2020==");
        System.out.println();
        System.out.println("    ==Kandidat Calon Presiden BEM==");
        System.out.println("            1. Haris");
        System.out.println("            2. Bisma");
        System.out.println("            3. Dian");
        System.out.println("            4. Rani");
        System.out.println("======================================");
        System.out.println();

        System.out.print("Masukkan jumlah terkumpul suara : ");
        int n = sc.nextInt();
        System.out.println();

        nomer4Main pilih = new nomer4Main(n);//agar cara dapat dipanggil
        do {
            System.out.println("Masukkan suara terpilih dengan nomor kandidat");
            for (int i = 0; i < pilih.n; i++) {
                System.out.print("Suara ke-" + (i + 1) + " : ");
                pilih.suara[i] = sc.nextInt();
            }

            pilih.pemilihan(0);//nested if dan memanggil cara pemilihan
            System.out.print("Presiden BEM Terpilih adalah : ");
            if (pilih.paslon1 > pilih.paslon2 && pilih.paslon1 > pilih.paslon3 && pilih.paslon1 > pilih.paslon4) {
                System.out.println("Haris");
                break;
            } else if (pilih.paslon2 > pilih.paslon1 && pilih.paslon2 > pilih.paslon3 && pilih.paslon2 > pilih.paslon4) {
                System.out.println("Bisma");
                break;
            } else if (pilih.paslon3 > pilih.paslon1 && pilih.paslon3 > pilih.paslon1 && pilih.paslon3 > pilih.paslon4) {
                System.out.println("Dian");
                break;
            } else if (pilih.paslon4 > pilih.paslon1 && pilih.paslon4 > pilih.paslon2 && pilih.paslon4 > pilih.paslon1) {
                System.out.println("Rani");
                break;
            } else if (pilih.paslon4 != pilih.paslon1 && pilih.paslon4 != pilih.paslon2 && pilih.paslon4 != pilih.paslon1) {
                System.out.println();
                System.out.println("Pilihan Suara Tidak Valid ");
                System.out.println();

            }
        } while (pilih.paslon4 != pilih.paslon1 && pilih.paslon4 != pilih.paslon2 && pilih.paslon4 != pilih.paslon1);
            //jika program ganjil akan mengulang lagi proses input suara 
    }
}
