/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4;

/**
 *
 * @author Rajendra Rakha
 */
import java.util.*;

class cara {

    static minMax[] arr = new minMax[5];
    static int min, max;

    static void Out() {
        arr[0] = new minMax();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = new minMax();
            System.out.println("Nilai Indeks ke " + (i + 1));
            System.out.print("Masukkan Nilai : ");
            arr[i].nilaiArray = sc.nextInt();
        }
        hitung();
        System.out.println();
        System.out.println("==Brute Force==");
        System.out.println("Nilai Maksimal : " + max);
        System.out.println("Nilai Minimum  : " + min);
    }

    static void hitung() {
        min = arr[0].nilaiArray;
        max = arr[0].nilaiArray;
        for (int i = 0; i < 5; i++) {
            if (arr[i].nilaiArray < min) {
                min = arr[i].nilaiArray;
            } else if (arr[i].nilaiArray > max) {
                max = arr[i].nilaiArray;
            }
        }
    }
}

public class MainBF {

    public static void main(String args[]) {

        cara OUT = new cara();//memnaggil class cara
        OUT.Out();//memanggil Out dr class cara

    }
}
