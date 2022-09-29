package array1;

import java.util.*;

public class Praktikum2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[] nilaiUAS = new int[6];

        for (int i = 0; i < nilaiUAS.length; i++) {
            System.out.print("Input Score UAS MHS ke-" + i + ": ");
            nilaiUAS[i] = sc.nextInt();

        }
        for (int i = 0; i < nilaiUAS.length; i++) {
            if (nilaiUAS[i] > 70) {
                System.out.println("---------------------------------");
                System.out.println("Mahasiswa ke-" + i + ": " + "lulus!");

            } else {
                System.out.println("---------------------------------");
                System.out.println("Mahasiswa ke-" + i + ": " + "Tidak lulus!");
            }

        }
    }
}
