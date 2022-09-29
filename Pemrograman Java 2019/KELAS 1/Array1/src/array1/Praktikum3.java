package array1;

import java.util.*;

public class Praktikum3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the number of students : ");
        n = sc.nextInt();
        int[] nilaiMHS = new int[n];
        int totallulus = 0, totaltdklulus = 0;
        float ratalulus = 0, ratatdklulus = 0;
       
        int mhsLulus = 0, mhsTidaklulus = 0;
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("Input Score Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMHS[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMHS.length; i++) {
            if (nilaiMHS[i] > 70) {
                mhsLulus += 1;
                totallulus += nilaiMHS[i];
                ratalulus = totallulus / mhsLulus;
            } else {
                mhsTidaklulus += 1;
                totaltdklulus += nilaiMHS[i];
                ratatdklulus = totaltdklulus / mhsTidaklulus;
            }
        }
        System.out.println("Average value that passed : " + ratalulus);
        System.out.println("Average value that Not passed : " + ratatdklulus);
    }
}
