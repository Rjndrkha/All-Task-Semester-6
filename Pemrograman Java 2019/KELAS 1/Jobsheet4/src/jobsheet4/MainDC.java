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

public class MainDC {

    public static void main(String args[]) {
        minMax[] arr = new minMax[5];
        arr[0] = new minMax();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            arr[i] = new minMax();
            System.out.println("Nilai Indeks ke " + (i + 1));
            System.out.print("Masukkan Nilai : ");
            arr[i].nilaiArray = sc.nextInt();
        }
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = arr[i].nilaiArray;
        }
        System.out.println();
        Maxmin hasil = new Maxmin();
        minMax MinMax = new minMax();
        MinMax.max_min(array, 0, 4, hasil);
        System.out.println("==Divide And Conquer==");
        System.out.println("Nilai Minimal  : " + hasil.minimum);
        System.out.println("Nilai Maksimal : " + hasil.maximum);
    }
}
