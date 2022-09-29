package Task;

import java.util.*;

public class number4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][5];
        int max = 0;
        int max1 = 0;
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Masukkan Array Baris [" + i + "] Kolom [" + j + "] : ");
                arr[i][j] = input.nextInt();
            }
            System.out.println("===========================================");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    a = j;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][a] > max1) {
                    max1 = arr[j][a];
                }
            }

            if (max == max1) {
                System.out.println("Nilai terbesar Baris dan Kolom : " + max);
            }
            max = 0;
            max1 = 0;
            System.out.println();
        }
    }
}
