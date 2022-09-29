/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4;

import java.util.Scanner;

/**
 *
 * @author Rajendra Rakha
 */
public class minMax {

    public int nilaiArray;

    public static void max_min(int[] arr, int first_index, int last_index, Maxmin result) {
        int index_mid;
        Maxmin result1 = new Maxmin();
        Maxmin result2 = new Maxmin();
        if (first_index == last_index) {
            result.minimum = result.minimum = arr[first_index];
        } else if (last_index - first_index == 1) {
            if (arr[first_index] > arr[last_index]) {
                result.minimum = arr[last_index];
                result.maximum = arr[first_index];
            } else {
                result.minimum = arr[first_index];
                result.maximum = arr[last_index];
            }
        } else {
            index_mid = (first_index + last_index) / 2;
            max_min(arr, first_index, index_mid, result1);
            max_min(arr, index_mid + 1, last_index, result2);

            result.minimum = (result1.minimum < result2.minimum) ? result1.minimum : result2.minimum;
            result.maximum = (result1.maximum > result2.maximum) ? result1.maximum : result2.maximum;
        }
    }

    public static void main(String[] args) {
        minMax p = new minMax();
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai Array indeks ke-" + i);
            System.out.print("Masukkan Nilai: ");
            ppArray[i].nilaiArray = sc.nextInt();
        }
        System.out.println();
        System.out.println("\t  ==Result Input Nilai== ");
        for (int i = 0; i < 5; i++) {
            System.out.print("            " + ppArray[i].nilaiArray + " ");
        }
        System.out.println();
        System.out.println();

        int min = ppArray[0].nilaiArray;
        int max = ppArray[0].nilaiArray;
        for (int i = 0; i < 5; i++) {
            if (ppArray[i].nilaiArray < min) {
                min = ppArray[i].nilaiArray;
            } else if (ppArray[i].nilaiArray > max) {
                max = ppArray[i].nilaiArray;
            }
        }

        System.out.println("==Brute Force==");
        System.out.println("Nilai Minimal: " + min);
        System.out.println("Nilai Maksimal: " + max);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = ppArray[i].nilaiArray;
        }

        Maxmin hasil = new Maxmin();
        max_min(arr, 0, 4, hasil);
        System.out.println();
        System.out.println("==Divide Conquer==");
        System.out.print("Nilai Minimal: " + hasil.minimum + "\nNilaiMaksimal: " + hasil.maximum);
        System.out.print("\n");
    }
}
