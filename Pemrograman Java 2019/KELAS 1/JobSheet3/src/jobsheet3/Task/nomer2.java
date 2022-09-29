/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3.Task;

import java.util.Scanner;

/**
 *
 * @author Rajendra Rakha
 */
public class nomer2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        System.out.print("Input Jumlah Murid : ");
        int student = sc.nextInt();//input jumlah Murid 
        System.out.println();
        nomer1 a = new nomer1(student);//pemanggilan Cara di Nomer1
        double total[] = new double[student];
        double average = 0;
        for (int i = 0; i < student; i++) {
            //proses input
            System.out.print("Masukkan Nama : ");
            a.namaMhs[i] = sca.nextLine();
            System.out.print("Masukkan Nilai Tugas : ");
            a.nilaiTugas[i] = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis : ");
            a.nilaiKuis[i] = sc.nextInt();
            System.out.print("Masukkan Nilai UTS : ");
            a.nilaiUts[i] = sc.nextInt();
            System.out.print("Masukkan Nilai UAS :");
            a.nilaiUas[i] = sc.nextInt();
            System.out.println();
            total[i] = a.Rumus(a.nilaiTugas[i], a.nilaiKuis[i], a.nilaiUas[i], a.nilaiUts[i]);//pemanggilan Rumus dari nomer 1 
            average = average + total[i];
        }

        System.out.println("====================================================");
        System.out.println("Rata Rata dari  " + a.namaMhs.length + " Siswa" + " : " + a.all(total));
    }
}
